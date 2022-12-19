class Solution {
    public int minPairSum(int[] nums) {
        int max = 0, temp = 0;
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < nums.length; i++) {
            temp = nums[i] + nums[j];
            max = Math.max(max, temp);
            j--;
        }
        return max;
    }
}
