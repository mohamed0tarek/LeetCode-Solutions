class Solution {
    public static void rotate(int[] nums, int k) {
        if(nums.length <= 1)return;
        k =k % nums.length;
        // reverse the left portion
        reverse(nums,0,nums.length-k-1);
        // reverse the right portion
        reverse(nums,nums.length-k,nums.length-1);
        // reverse the whole array
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums,int left,int right){
        while (left < right) {
            int temp= nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}
