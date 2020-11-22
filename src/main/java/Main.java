public class Main {
  /**
   * Транспонирует матрицу.
   *
   * @param matrix матрица.
   * @return Транспонированная матрица.
   */
  public static int[][] transposeMatrix(int[][] matrix) {
    int [][] transposedMatrix = new int [matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        transposedMatrix[j][i] = matrix[i][j];
      }
    }
    return transposedMatrix;
  }
}


