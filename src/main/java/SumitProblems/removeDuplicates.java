package SumitProblems;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicates {

    public static void main(String[] args) {
        String s = "amal";

        System.out.println(s.length());

        LinkedHashSet hs = new LinkedHashSet();

        for(int i = 0 ; i <=3 ; i++ )
        {
            hs.add(s.charAt(i));
        }

        System.out.println(hs);
    }
}
