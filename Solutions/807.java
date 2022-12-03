class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum =0;
        for (int i = 0 ;i< grid.length;i++){
            for (int j =0 ;j<grid[i].length;j++){
                int old = grid[i][j];
                grid[i][j] = Math.min(rowMax(grid[i]),colMax(grid, j));
                sum += (grid[i][j] - old);
            }
        }
        return sum;
    }

    private int colMax(int[][] grid, int j) {
        int max =0;
        int row =0;
        for (int z=0;z< grid.length;z++){
            max = Math.max(max, grid[row][j]);
            row++;
        }
        return max;
    }

    private int rowMax(int[] ints) {
        return Arrays.stream(ints).max().getAsInt();
    }
}
