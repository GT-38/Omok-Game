package src;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Filter {

    public static  final int BLANK = 0; // final 은 대문자로 쓰는게 국룰
    public static final int STONE = 1; // final 은 대문자로 쓰는게 국룰
    public static final int checkerboardLength = 19;

    //색 필터링 해주는 매소드
    public static int[][] colorFilter(int[][] result, int color) {
        int[][] coloredResult = new int[checkerboardLength][checkerboardLength];
        for (int i = 0; i < checkerboardLength; i++) {
            for (int j = 0; j < checkerboardLength; j++) {
                if (result[i][j] == color) {
                    coloredResult[i][j] = STONE ;
                } else {
                    coloredResult[i][j] = BLANK;
                }
            }
        }
        return coloredResult;
    }

    // 방향별 모든 라인 포함하는 이차원 배열
    public int[][] horizontals = new int[checkerboardLength][checkerboardLength];
    public int[][] verticals = new int[checkerboardLength][checkerboardLength];
    public int[][] increasingDiagonals = new int[2 * checkerboardLength - 9][checkerboardLength];
    public int[][] decreasingDiagonals = new int[2 * checkerboardLength - 9][checkerboardLength];

    public void getHoriVertis(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                horizontals[i][j] = result[i][j];
                verticals[i][j] = result[j][i];
            }
        }
    }

    public void getDiagonals(int[][] result) {
        for (int i = 0; i < 29; i++) {
            for (int j = 0; j < 33 - max(i, 28 - i); j++) {
                increasingDiagonals[i][j] = result[min(18, i + 4) - j][max(0, i - 14) + j];
                decreasingDiagonals[i][j] = result[max(0, i - 14) + j][max(0, 14 - i) + j];
            }
        }
    }
}