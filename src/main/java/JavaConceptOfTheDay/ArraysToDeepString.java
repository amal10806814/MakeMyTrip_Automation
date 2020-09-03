package JavaConceptOfTheDay;

import java.util.Arrays;

public class ArraysToDeepString {
    public static void main(String[] args) {

        int[][] a = {{1,2,3,4},{3,4,5,6,8}};

        System.out.println(Arrays.deepToString(a));

        //three dimensional array

        int[] [] [] b = {
                        {{1,2,3,},{3,4,5}},
                        {{2,3,4},{5,6,7}},
                        {{3,2,1},{8,9,0}}
                        };

        System.out.println(Arrays.deepToString(b));
    }
}
