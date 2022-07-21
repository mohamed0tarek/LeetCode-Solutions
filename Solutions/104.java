class Solution {
    public int maxDepth(TreeNode root) {
        int count =1;
        if (root == null)
            return 0;
        return traverse(root, root.left,root.right,count);
    }
    
    public int traverse(TreeNode rootN,TreeNode leftN,TreeNode rightN,int count){
        if(leftN == null && rightN == null)
            return count;

        count++;
        int le=0,ri=0;
        if(leftN != null) {le = traverse(leftN, leftN.left, leftN.right,count);}
        if(rightN != null) {ri = traverse(rightN, rightN.left, rightN.right,count);}
        return Math.max(le,ri);
    }
}
