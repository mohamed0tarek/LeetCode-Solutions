class Solution {
    public int balancedStringSplit(String s) {
        int counter = 0;
        int res = 0;
        for(char ch : s.toCharArray()){
            counter += (ch == 'R')? 1 : -1;
            res += counter == 0 ? 1 : 0;
        }
        return res;
    }
}
