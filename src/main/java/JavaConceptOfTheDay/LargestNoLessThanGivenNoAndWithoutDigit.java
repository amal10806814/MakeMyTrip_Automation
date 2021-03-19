package JavaConceptOfTheDay;

import java.util.Arrays;

public class LargestNoLessThanGivenNoAndWithoutDigit {

    public static int LargestNo(int GivenNo , int WithoutDigit)
    {

        char c = Integer.toString(WithoutDigit).charAt(0);

        for(int i = GivenNo ; i >0 ; i-- )
        {
            if(Integer.toString(i).indexOf(c)==-1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(LargestNo(143,4));

    }
}
