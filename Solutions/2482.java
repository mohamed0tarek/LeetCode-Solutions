class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] onesRow = new int[n];
        int[] onesColumn = new int[m];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++)
                count += grid[i][j];
            onesRow[i] = count;
        }

        for (int j = 0; j < m; j++) {
            int count = 0;
            for (int i = 0; i < n; i++)
                count += grid[i][j];
            onesColumn[j] = count;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                grid[i][j] = onesRow[i] + onesColumn[j] - (n - onesRow[i]) - (m - onesColumn[j]);
        }
        return grid;
    }
}
