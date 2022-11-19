

import src.*;

import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main implements Distinction {
    public final int ERROR= 0;
    public final int BLACKWIN =1;
    public final int WHITEWIN = 2;
    public final int DRAW =3;
    public final int NOPROBLEM = 0;
    public final int PROBLEM = 1;


    public static  void printResult(int[][] result){

        for (int i = 0; i < result.length; i++) {
            int[] inResult = result[i];
            for (int j = 0; j < inResult.length; j++) {
                System.out.print(inResult[j] + " ");
            }
            System.out.println();
        }
    }


    public int check (int[][] result){
        int gameResult = 0;
        if(PreCheck.preChecking(result) == PROBLEM){
            return ERROR;
            System.out.println("오목판이 아닙니다.");
        }else{
            if(Finder.figures.contains(1)==true){
                return
            }
        }
    }

    public static void main(String[] args) {

        Filter filter = new Filter();
        Finder finder = new Finder();
        Result result = new Result();
        PreCheck preCheck = new PreCheck();
        System.out.println(preCheck.preChecking(Result.rawDataSet));



//        filter.getHoriVertis(Result.rawDataSet);
//        filter.getDiagonals(Result.rawDataSet);
//        finder.figureFinder(filter.horizontals);
//        finder.figureFinder(filter.verticals);
//        finder.figureFinder(filter.increasingDiagonals);
//        finder.figureFinder(filter.decreasingDiagonals);
//        System.out.println(finder.figures.toString());

    }
}