package PracticeProject;

import java.util.Scanner;

public class Ternaryoperator {

  public static void main (String args[])
  {
    int num1 , num2 , num3 , result ,sum;

    Scanner x = new Scanner(System.in);
    System.out.println("Enter first number");
    num1 = x.nextInt();

    Scanner y =new Scanner (System.in);
    System.out.println("Enter Second number ");
    num2 = y.nextInt();

    Scanner z = new Scanner(System.in);
    System.out.println("Enter third number");
    num3 = z.nextInt();

    sum = num1 > num2 ? num1 : num2 ;

    result = num3 > sum ? num3 : sum ;

    System.out.println(result);


  }

}
