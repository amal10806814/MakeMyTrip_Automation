package JavaPractice;

import java.util.Scanner;

public class Factorial_Class {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

   // System.out.println( "enter string ");   ---- for String input
   // s.next();

    Scanner scn = new Scanner (System.in);

    System.out.println("enter number");

    int y =scn.nextInt();

    int a =1;

    for(int i =1 ; i<=y ; i++)
    {
    //  a = i + a ;

      a = i * a ; // a =2

    }

    System.out.println(a);


  }

}

