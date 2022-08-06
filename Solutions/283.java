class Solution {
    public void moveZeroes(int[] nums) {
       int i, j = 0, temp = 0;
        while (j < nums.length && nums[j] != 0) j++;
        for (i = j; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
