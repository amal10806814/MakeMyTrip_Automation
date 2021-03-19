package JavaConceptOfTheDay;

import java.util.Arrays;

public class preservingOrder {

    public static void main(String[] args) {

        String s = "i am a good person";

        char[] ch  = s.toCharArray();

        char[] ch1 = new char[ch.length];


        for(int i = 0 ; i< ch.length ; i++)
        {
            if(ch[i]==' ')
            {
                ch1[i] = ch[i];
                        }
        }

        int j = ch.length-1;

        for(int i =0 ; i < ch.length ; i++)
        {
            if(ch[i]!=0)
            {
                ch1[j] = ch[i];
                j--;
            }

            if(ch[i]==0)
            {
                j--;
            }
        }

        System.out.println(String.valueOf(ch1));
    }
}
