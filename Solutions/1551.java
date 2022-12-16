class Solution {
    public int minOperations(int n) {
        int start = (n % 2 == 0)? n+1 : n+2;
        int end = 2*(n-1) + 1;
        int op =0;
        for(int i = start ; i<= end; i = i+2)
            op += i - n;
        return op;
    }
}
