class Solution {
    public int removeDuplicates(int[] nums) {
        int count =1, prev =0;
        for (int i=1 ;i<nums.length;i++){
            if(nums[i] != nums[prev]){
                count++;
                prev++;
                nums[prev] = nums[i];
            }     
        }
        return count;
    }
}
