class Solution {
    private int[] getFirstIslandLoc ( int[][] grid, int m, int n ) {
		for ( int i = 0; i < m; i++ )
			for ( int j = 0; j < n; j++ )
				if ( grid[i][j] == 1 ) return new int[] {i, j};
		return null;
	}
    public int islandPerimeter(int[][] grid) {
        int m = grid.length, n = grid[0].length, perimeter = 0;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> lq = new LinkedList<>();
        int[] fI = this.getFirstIslandLoc(grid, m, n);
        lq.offer(fI);
        
        while ( !lq.isEmpty() ) {
        	int[] ref = lq.poll();
        	int i = ref[0], j = ref[1];
        	if ( i >= m || i < 0 || j >= n || j < 0 || grid[i][j] == 0 ) {
        		perimeter++;
        		continue;
        	}
        	if ( visited[i][j] == true ) continue;
        	
        	visited[i][j] = true;
        	lq.offer(new int[] { i, j + 1 });
        	lq.offer(new int[] { i, j - 1 });
        	lq.offer(new int[] { i + 1, j });
        	lq.offer(new int[] { i - 1, j });
        }
        return perimeter;
    }
}
