package SumitProblems;

import java.util.Arrays;

public class whiteSpaces {
    public static void main(String[] args) {
        String s = "a b c d";

//       String s1 = s.replaceAll("\\s" , "");
//
//        System.out.println(s1);

        char[] ch = s.toCharArray();

        String result = "";

        for (int i = 0 ; i< ch.length ; i++)
        {
            if(ch[i]!= ' ')
            {
                result = result + ch[i];
            }
        }
        System.out.println(result);

    }
}
