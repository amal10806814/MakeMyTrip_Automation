package JavaConceptOfTheDay;

import java.util.Arrays;
import java.util.HashMap;

public class countOccurence {
    public static void main(String[] args) {
        int [] a = {12,9,12,9,10,9,10,11};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int c  : a)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) +1);
            }
            else
            {
                map.put(c, 1);
            }
        }

        System.out.println(map);

    }
}
