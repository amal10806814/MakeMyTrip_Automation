package JavaConceptOfTheDay;

import java.util.LinkedHashMap;

public class longSubStringWIthoutRepeating {

    static void longestSubString(String s)
    {
        char[] charArray = s.toCharArray();

        String longestSubString = null;
        int longestSubStringLength = 0;

        LinkedHashMap<Character, Integer> map =new LinkedHashMap<Character, Integer>();

        for(int i =0 ; i < charArray.length ; i++)
        {
            char ch = charArray[i];

            if(!map.containsKey(ch))
            {
                map.put(ch , i);
            }
            else
            {
                i = map.get(ch);
                map.clear();
            }

            if(map.size()>longestSubStringLength)
            {
                longestSubStringLength = map.size();
                longestSubString = map.keySet().toString();
            }
        }
        System.out.println("input string" + s);
        System.out.println("longest substring" + longestSubString);
        System.out.println("longest sub string length" + longestSubStringLength);
    }

    public static void main(String[] args) {
        longestSubString("javaconceptoftheday");
    }
}
