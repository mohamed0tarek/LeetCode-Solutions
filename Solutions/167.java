class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int L = 0, R = len - 1, sum;
        
        while(L < R) {
            sum = numbers[L] + numbers[R];
            
            if(sum == target) return new int[]{L + 1, R + 1};
            else if(sum < target) L++;
            else R--;
        }
        
        return new int[]{0, 0};
    }
}
