class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int n) {
        if(root == null) return n;
        n++;
        return Math.max(maxDepth(root.left, n), maxDepth(root.right, n));
    }
}
