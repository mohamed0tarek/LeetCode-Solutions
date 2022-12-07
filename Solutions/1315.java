Without global variable
-------------------------------------
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        int sum = 0;
        return DFS(root, null, null, sum);
    }

    private int DFS(TreeNode node, TreeNode parent, TreeNode grandParent, int sum) {
        if(node == null)
            return sum;
        if (grandParent != null && grandParent.val % 2 == 0)
            sum += node.val;
        grandParent = parent;  parent = node;
        sum = DFS(node.left, parent, grandParent, sum);
        sum = DFS(node.right, parent, grandParent, sum);
        return sum;
    }
}
========================================================================================
With gloable variable
------------------------------------
class Solution {
    int sum =0;
    public int sumEvenGrandparent(TreeNode root) {
        return DFS(root, null, null);
    }

    private int DFS(TreeNode node, TreeNode parent, TreeNode grandParent) {
        if(node == null)
            return sum;
        if (grandParent != null && grandParent.val % 2 == 0)
            sum += node.val;
        grandParent = parent;  parent = node;
        sum = DFS(node.left, parent, grandParent);
        sum = DFS(node.right, parent, grandParent);
        return sum;
    }
}
