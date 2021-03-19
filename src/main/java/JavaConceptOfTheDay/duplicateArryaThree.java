package JavaConceptOfTheDay;

import java.util.HashMap;

public class duplicateArryaThree {
    public static void main(String[] args) {

        int a [] = {1,2,1,3,4,5,6,2,4,8,2,3};

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (Integer a1 : a)
        {
            if(hm.containsKey(a1))
            {
                hm.put(a1, hm.get(a1) +1);
            }
            else{
                hm.put(a1, 1);
            }
        }
        System.out.println(hm);
    }
}
