class Solution {
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }
    
    private String traverse(TreeNode node) {
        if (node == null) {
            return "";
        }
        
        String curr = new StringBuilder()
            .append(node.val).append(":")
            .append(traverse(node.left)).append(",")
            .append(traverse(node.right)).append(";")
            .toString();
        
        int count = map.getOrDefault(curr, 0);
        if (count == 1) {
            res.add(node);
        }
        map.put(curr, count+1);
        
        return curr;
    }
}
