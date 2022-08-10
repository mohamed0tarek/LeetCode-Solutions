class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int M = matrix.length;
        int N = matrix[0].length;
        int i = 0, j = 0;
        while (res.size() < M * N) {
            // right move
            while (j < N && matrix[i][j] > -200) {
                res.add(matrix[i][j++]);
                matrix[i][j - 1] = -200;
            }
            j--;
            i++;
            // down move
            while (i < M && matrix[i][j] > -200) {
                res.add(matrix[i++][j]);
                matrix[i - 1][j] = -200;
            }
            i--;
            j--;
            // left move
            while (j > -1 && matrix[i][j] > -200) {
                res.add(matrix[i][j--]);
                matrix[i][j + 1] = -200;
            }
            j++;
            i--;
            // up move
            while (i > -1 && matrix[i][j] > -200) {
                res.add(matrix[i--][j]);
                matrix[i + 1][j] = -200;
            }
            i++;
            j++;
        }
        return res;
    }
}
