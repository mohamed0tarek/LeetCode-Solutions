class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] result = new int [nums.length];
        int positvePosition = 0;
        int negativePosition = 1;
        for(int i=0 ;i<nums.length ;i++){
            if(nums[i] >= 0){
                result[positvePosition] = nums[i];
                positvePosition += 2;
            }else {
                result[negativePosition] = nums[i];
                negativePosition += 2;
            }
        }
        return result;
    }
}
