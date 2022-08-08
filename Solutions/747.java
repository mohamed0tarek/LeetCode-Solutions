class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0], index = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max / 2 && nums[i] != max)
                return -1;
        return index;
    }
}
