class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximum =0,temp =0;
        for (int j=0;j<accounts[0].length;j++){
            maximum += accounts[0][j];
        }
        for (int i=1;i<accounts.length;i++){
            for (int j=0;j<accounts[0].length;j++){
                temp += accounts[i][j];
            }
            maximum = Math.max(maximum,temp);
            temp =0;
        }
        return maximum;
    }
}
