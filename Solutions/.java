class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int res =0;
        for(int x : nums){
            count =(x == 1)?count+1:0;
            res = Math.max(res,count);
        }
        return res;
    }
}
