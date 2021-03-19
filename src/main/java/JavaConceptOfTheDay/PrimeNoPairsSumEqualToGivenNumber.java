package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNoPairsSumEqualToGivenNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int a = s.nextInt();

        //used arraylist because i wanted to store all the primes nos in an array
        ArrayList<Integer> al = new ArrayList<Integer>();

        //logic to get the primes no before a given no
        for(int i = 2 ; i < a ; i++)
        {
            boolean isboolean = true;
            for(int j = 2 ; j < i ; j++)
            {
                if(i%j==0)
                {
                    isboolean =false;
                   break;
                }
            }
            if(isboolean)
            {
                al.add(i);

            }
        }

        // we will get the arraylist of primes nos before the given no
        System.out.println(al);

        //to convert arraylist to an array
        Integer[] arr = new Integer[al.size()];

        for(int i = 0 ; i < al.size(); i++)
        {
            arr[i]= al.get(i);
        }

        //now from the array of prime nos , will check whether pair of prime numbers equal to given no
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            for(int j = i+1 ; j<arr.length ; j++ ) {
                int c = arr[i] + arr[j];
                if (c == a)
                {
                    System.out.println(arr[i] + " and " + arr[j]);
                }
                c = 0;
            }
        }
    }
}
