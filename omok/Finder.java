package src;

import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Finder {
    final int OMOK= 1;
    final int JANGMOK = 2;

    public ArrayList<Integer> figures = new ArrayList<>() ;
    public   void figureFinder(int[][] result) {
        for (int i = 0;  i < result.length;  i ++) {
            int numberOfEyes = 0;
            for (int j = 0;  j < 19 ;  j++) {
                if(result[i][j] != 1) {
                    if(numberOfEyes==5){
                        figures.add(OMOK);
                    }else if(numberOfEyes >= 6){
                        figures.add(JANGMOK);
                        System.out.println(numberOfEyes);
                    }
                    numberOfEyes = 0;
                    continue;
                }else{
                    numberOfEyes++;
                    }
                }
        }
    }
}


