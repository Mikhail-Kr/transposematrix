public class Main {
  /**
   * Транспонирует матрицу.
   *
   * @param matrix матрица.
   * @return Транспонированная матрица.
   */
  @SuppressWarnings({"checkstyle:MultipleVariableDeclarations", "checkstyle:Indentation", "checkstyle:LeftCurly", "checkstyle:NeedBraces", "checkstyle:LineLength"})
  public static int[][] transposeMatrix(int[][] matrix) {
      int [][] tr = new int [matrix[0].length][matrix.length];
      int n = matrix[0].length;
      int m = matrix.length;
      for (int i = 0; i < m; i++)
      {
          for (int j = 0; j < n; j++) tr[j][i] = matrix[i][j];
      }
      return tr;
  }
}


