package SumitProblems;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class ReplaceDuplicatesWithZero {

    public static void main(String[] args) {

        int [] a = {1,1,2,2,3,4,4,4,5,5};

        int b[] = new int[10];

        int count =0;
        int j=0 ;

        for(int i =0 ; i<a.length-1 ; i++)
        {
            if(a[i]==a[i+1])
            {
                count ++ ;
            }
            else
            {
                b[j] = a[i];
                j++;
            }

        }
        b[j] = a[a.length-1];

        System.out.println(Arrays.toString(b));












//        int b[] = new int [10];
//
//        int j =0 ;
//
//        int count = 0;
//
//        for(int i =0; i<a.length-1 ; i++)
//        {
//                if(a[i]!=a[i+1]) {
//                    b[j]=a[i];
//                    j++;
//                }
//                else{
//                    count ++;
//                 }
//            }
//        b[j]=a[a.length-1]; //to add value of last element else bcoz if we add it using the above loop , we should have got ArrayIndexOutOfBoundError
//
//        //Printing values to check duplicate values being removed or not and also check the count of them
//        System.out.println(Arrays.toString(b));
//        System.out.println(count);
//
//        for (int i=6 ; i<a.length;i++)
//        {
//            b[i]=0;
//        }
//
//        System.out.println(Arrays.toString(b));
        }

    }

