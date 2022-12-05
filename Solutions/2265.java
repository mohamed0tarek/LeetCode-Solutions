first sol
------------------------
class Solution {

    class Pair {
        int sum;
        int count;

        public Pair(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }
    }

    int res;
    public Pair averageOfSubtree_helper(TreeNode root) {
        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = averageOfSubtree_helper(root.left);
        Pair right = averageOfSubtree_helper(root.right);

        int sum = left.sum + right.sum + root.val;
        int count = left.count + right.count + 1;

        if (sum / count == root.val) {
            res++;
        }

        return new Pair(sum, count);
    }

    public int averageOfSubtree(TreeNode root) {
        res = 0;
        averageOfSubtree_helper(root);
        return res;
    }
}
==================================================================================

Second sol
-----------------------
class Solution {
    private int num =0;
    
    public int averageOfSubtree(TreeNode root) {
        if (root == null) return 0;
        if (root.val == (sumNodes(root) / (numOfNodes(root))))
            num++;
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return num;
    }

    private int numOfNodes(TreeNode node) {
        if (node == null)
            return 0;
        return 1+numOfNodes(node.left) + numOfNodes(node.right);
    }

    public int sumNodes(TreeNode node){
        if (node == null)
            return 0;
        return node.val + sumNodes(node.left) + sumNodes(node.right);
    }

}
