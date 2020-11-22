public class Main {
  /**
   * Транспонирует матрицу.
   *
   * @param matrix матрица.
   * @return Транспонированная матрица.
   */
  public static int[][] transposeMatrix(int[][] matrix) {
    int [][] TransposedMatrix = new int [matrix[0].length][matrix.length];
    int n = matrix.length;
    int m = matrix[0].length;
      for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        TransposedMatrix[j][i] = matrix[i][j];
      }
    }
    return TransposedMatrix;
  }
}


