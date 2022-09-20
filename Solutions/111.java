class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)return 0;
        int level =1;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int size = que.size();
            while(size > 0){
                TreeNode node = que.poll();
            if(node.left == null && node.right == null)
                return level;
            if(node.left != null)que.add(node.left);
            if(node.right != null)que.add(node.right);
            size--;
            }
            level++;
        }
        return level;
    }
}
