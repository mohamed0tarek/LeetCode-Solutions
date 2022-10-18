class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        DFS(root1, result);
        DFS(root2, result);
        result.sort((v1,v2)->v1-v2);
        return result;        
    }

    private void DFS(TreeNode root, List<Integer> result) {
        if (root != null){
            result.add(root.val);
            DFS(root.left, result);
            DFS(root.right, result);
        }
    }
}
