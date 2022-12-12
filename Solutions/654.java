class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) return null;
        int max = findMaxNum(nums);
        TreeNode node = new TreeNode(nums[max]);
        node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0,max));
        node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, max+1, nums.length));
        return node;
    }

    public int findMaxNum(int[] array){
        int maxAt = 0;
        for (int i = 0; i < array.length; i++)
            maxAt = array[i] > array[maxAt] ? i : maxAt;
        return maxAt;
    }
}
