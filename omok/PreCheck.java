package src;

import src.Filter;

public class PreCheck {
    public final int NOPROBLEM = 0;
    public final int PROBLEM = 1;
    public final int BLACK = 1;
    public final int WHITE = 2;
    public final int checkerboardLength = 19;

    public int preChecking (int[][] result){
        int blackSum = 0;
        int whiteSum = 0;
        for(int i = 0; i < checkerboardLength; i ++){
            for(int j = 0; j < checkerboardLength; j ++){
                blackSum += Filter.colorFilter(result,BLACK)[i][j];
                whiteSum += Filter.colorFilter(result,WHITE)[i][j];
            }
        }
        if(blackSum-whiteSum == 1 | blackSum-whiteSum == 0){
           return NOPROBLEM;
        }else{
            return  PROBLEM;
        }

    }
}
