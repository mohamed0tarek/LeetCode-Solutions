class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int level = 0, sum =0;
        level = DFSForDepth(root, level);
        return DFSForSum(root,level-1,sum, 0);
        
    }

    private int DFSForDepth(TreeNode root, int level) {
        if(root != null) return Math.max(DFSForDepth(root.left, level + 1), DFSForDepth(root.right, level + 1));
        return level;
    }

    private int DFSForSum(TreeNode root, int level, int sum, int currLevel) {
        if(root != null){
            sum = DFSForSum(root.left, level, sum, currLevel+1)
            + DFSForSum(root.right, level, sum, currLevel+1);
            if (currLevel == level)
                return sum+root.val;
        }
        return sum;
    }
}
