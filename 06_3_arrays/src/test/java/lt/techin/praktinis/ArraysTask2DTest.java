package lt.techin.praktinis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("06_3 Arrays Task 2D")
public class ArraysTask2DTest {
    static Stream<Arguments> provideArgumentsForAverageMark() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 4, 5}, {4, 9, 4}, {9, 4, 5}}, 5.44),
                Arguments.of(new int[][]{{6, 4, 8}, {9, 6, 2}, {1, 4, 5}}, 5.0),
                Arguments.of(new int[][]{{7, 7, 9}, {3, 6, 9}, {2, 5, 6}}, 6.0),
                Arguments.of(new int[][]{{70, 46, 100}, {33, 68, 25}, {17, 49, 67}}, 52.78),
                Arguments.of(new int[][]{{6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}}, 3.5)
        );
    }

    static Stream<Arguments> provideArgumentsForMinMark() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 4, 5}, {4, 9, 4}, {9, 4, 5}}, 4),
                Arguments.of(new int[][]{{6, 4, 8}, {9, 6, 2}, {1, 4, 5}}, 1),
                Arguments.of(new int[][]{{7, 7, 9}, {3, 6, 9}, {2, 5, 6}}, 2),
                Arguments.of(new int[][]{{70, 46, 100}, {33, 68, 25}, {17, 49, 67}}, 17),
                Arguments.of(new int[][]{{6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}}, 0)
        );
    }

    static Stream<Arguments> provideArgumentsForMaxMark() {
        return Stream.of(
                Arguments.of(new int[][]{{5, 4, 5}, {4, 9, 4}, {9, 4, 5}}, 9),
                Arguments.of(new int[][]{{6, 4, 8}, {9, 6, 2}, {1, 4, 5}}, 9),
                Arguments.of(new int[][]{{7, 7, 9}, {3, 6, 9}, {2, 5, 6}}, 9),
                Arguments.of(new int[][]{{70, 46, 100}, {33, 68, 25}, {17, 49, 67}}, 100),
                Arguments.of(new int[][]{{6, 4, 7}, {0, 1, 2}, {1, 4, 4}, {4, 4, 5}}, 7)
        );
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("provideArgumentsForAverageMark")
    @DisplayName("Average for all marks")
    void getAverageMarkTest(int[][] marks, double expected) {
        double actual = ArraysTask2D.getAverageMark(marks);

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("provideArgumentsForMinMark")
    @DisplayName("Min for all marks")
    void getMinMarkTest(int[][] marks, int expected) {
        int actual = ArraysTask2D.getMinMark(marks);

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Marks: {0}")
    @MethodSource("provideArgumentsForMaxMark")
    @DisplayName("Max for all marks")
    void getMaxMarkTest(int[][] marks, int expected) {
        int actual = ArraysTask2D.getMaxMark(marks);

        assertEquals(expected, actual);
    }
}
