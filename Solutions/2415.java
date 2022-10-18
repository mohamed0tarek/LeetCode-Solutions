class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root.left == null) return root;
        DFS(root.left, root.right, 1);
        return root;
    }

    private void DFS(TreeNode root1, TreeNode root2, int level) {
        if (root1 != null){
            if(level % 2 != 0){
                int temp = root1.val;
                root1.val = root2.val;
                root2.val = temp;
            }
            DFS(root1.left, root2.right, level+1);
            DFS(root1.right, root2.left, level+1);
        }
    }
}
