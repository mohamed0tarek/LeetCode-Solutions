class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = Arrays.copyOf(nums,nums.length*2);
        int pointer = nums.length;
        for (int i=0;i<nums.length;i++){
            ans[pointer] = ans[i];
            pointer++;
        }
        return ans;
    }
}
