import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest {

  @ParameterizedTest
  @MethodSource("matrixFactory")
  void transposeMatrix(int[][] matrix, int[][] expected) {
    assertArrayEquals(expected, Main.transposeMatrix(matrix));
  }

  static Stream<Arguments> matrixFactory() {
    return Stream.of(
      arguments(
        new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
          },
        new int[][] {
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
          }
      ),
      arguments(
        new int[][] {
            {1, 2, 3},
            {4, 5, 6}
          },
        new int[][] {
            {1, 4},
            {2, 5},
            {3, 6}
          }
      ),
      arguments(
        new int[][] {
            {1, 4},
            {2, 5},
            {3, 6}
          },
        new int[][] {
            {1, 2, 3},
            {4, 5, 6}
          }
      )
    );
  }
}