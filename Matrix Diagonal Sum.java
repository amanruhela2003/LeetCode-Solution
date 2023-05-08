class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length, m = mat[0].length;
        int i = 0, j = m - 1;
        for (int k = 0; k < n; k++) {
            if (i != j) {
                sum += mat[k][i] + mat[k][j];
            }
            else {
                sum += mat[k][i];
            }
            i++;
            j--;
 
        }
        return sum;
    }
}
