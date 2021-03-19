package SumitProblems;

import java.util.*;

public class CountOccurrencesOfEachCharacterInString {

    public static void main(String[] args) {

        String  s = "butterbetter" ;

        char[] ch = s.toCharArray();

        HashMap<Character, Integer>  hm = new HashMap<Character, Integer>();

        for(int i = 0 ; i < ch.length ; i ++)
        {
            if(hm.containsKey(ch[i]))
            {
                hm.put(ch[i], hm.get(ch[i]) +1 );
            }
            else
            {
                hm.put(ch[i] , 1 );
            }
        }
        
        System.out.println(hm);

       Set<Character> entry =  hm.keySet();
       Collection<Integer> val=  hm.values();

      Set<Map.Entry<Character, Integer>> entryset1 = hm.entrySet();
        ArrayList<Map.Entry<Character,Integer>> al = new ArrayList<Map.Entry<Character,Integer>>(entryset1);

        System.out.println(al);

        for(Map.Entry<Character,Integer> entrynew : al)
        {
            System.out.println(entrynew.getKey() + " " +entrynew.getValue());
        }
    }
}
