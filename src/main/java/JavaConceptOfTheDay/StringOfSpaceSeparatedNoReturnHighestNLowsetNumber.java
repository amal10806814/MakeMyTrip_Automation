package JavaConceptOfTheDay;

import java.util.Arrays;

public class StringOfSpaceSeparatedNoReturnHighestNLowsetNumber {

    public static void main(String[] args) {

        String s = "5 2 3 4 1";
        String[] s2 = s.split(" ");

        int [] a = new int[s2.length];

        int i = 0;
        for(String s3 : s2)
        {
            a[i]= Integer.parseInt(s3);
            i++;
        }

        Arrays.sort(a);

        System.out.println("smallest no : " + a[0]);
        System.out.println("highest no : " + a[a.length-1]);

    }
}
