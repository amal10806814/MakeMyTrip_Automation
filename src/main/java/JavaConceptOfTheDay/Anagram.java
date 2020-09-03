package JavaConceptOfTheDay;

import Collections.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public static void anagram(String s1 , String s2)
    {

        String News1 = s1.replaceAll("\\s", "");
        String News2 = s2.replaceAll("\\s", "");

        char [] ch = News1.toLowerCase().toCharArray();
        char[] ch1 = News2.toLowerCase().toCharArray();

        if(ch.length!=ch1.length)
        {
            System.out.println("not an anagram");
            return;
        }
        else
        {
            Arrays.sort(ch);
            Arrays.sort(ch1);
            System.out.println(Arrays.equals(ch , ch1));
        }
    }

    public static void main(String[] args) {
        anagram("Mother In Law" , "Hitler Woman");
    }
}