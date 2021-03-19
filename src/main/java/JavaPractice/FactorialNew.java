package JavaPractice;

import java.util.Scanner;

public class FactorialNew {

    public static void main(String[] args) {

        int a =1 ;
        Scanner b = new Scanner(System.in);
        System.out.println("Enter no");

        int s = b.nextInt();

//        for (int i = s ; i>=1 ; i --)
//        {
//            a = a*i;
//        }
//        System.out.println(a);

        for (int i = 1; i <= s; i++)
        {
            a = a *i;
        }
        System.out.println(a);
    }
}
