class Solution {
    public boolean evaluateTree(TreeNode root) {
        return DFS(root) == 1;
    }

    private int DFS(TreeNode root) {
        if (root.val == 2){
            int sum = DFS(root.left) + DFS(root.right);
            return (sum == 2)?1:sum;   
        } 
        if (root.val == 3)
            return DFS(root.left) * DFS(root.right);
        return root.val;
    }
}
