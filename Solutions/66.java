class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        digits[i]++;
        while (digits[i] > 9 && i > 0){
            digits[i--] = 0;
            digits[i]++;
        }
        if(digits[0] != 10)
            return digits;
        else {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
    }
}
