package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class duplicateString {

    public static void main(String[] args) {

        String str = "java very is very difficult java very";

        String[] sa = str.split(" ");


        HashMap<String, Integer> hm = new HashMap<String, Integer>();


        for(String word : sa )
        {
           if(hm.containsKey(word))
           {
               hm.put(word, hm.get(word) +1 );
           }
           else
           {
               hm.put(word,1);
           }
        }

        Set<String> ss = hm.keySet();

       for(String wordCount : ss)
       {
           if(hm.get(wordCount) > 1)
           {
               System.out.println(wordCount +" "+ hm.get(wordCount));
           }
       }





    }

}
