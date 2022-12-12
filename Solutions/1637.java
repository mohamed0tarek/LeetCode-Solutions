First solution
---------------------------
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = 0;
        int[] temp = new int[points.length];
        for (int i = 0; i < points.length; i++) 
            temp[i] = points[i][0];
        Arrays.sort(temp);
        for(int i=1;i<temp.length;i++){
            int width = temp[i] - temp[i-1];
            max = Math.max(width, max);
        }
        return max;
    }
}
=============================================================
Second
-----------------------------
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(p -> p[0]));
        int mx = 0;
        for (int i = 1; i < points.length; ++i) {
            int w = points[i][0] - points[i - 1][0];
            mx = Math.max(mx, w);
        }
        return mx;
    }
}
