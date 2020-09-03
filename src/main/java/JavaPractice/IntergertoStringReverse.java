package JavaPractice;

import java.util.Scanner;

public class IntergertoStringReverse {
  public static void main(String[] args) {
    StringBuffer strb = new StringBuffer();
    Scanner scn = new Scanner(System.in);
    System.out.println("enter number");
    int a = scn.nextInt();
    String str = Integer.toString(a);
    char[] arr = str.toCharArray();
    for( int i =arr.length-1 ; i>=0 ; i --)
    {
      strb.append(arr[i]);
    }
    System.out.println(strb);

    String x = strb.toString();

    int y = Integer.parseInt(x);

    System.out.println("back to interger value " + y);

    if (y ==a)
    {
      System.out.println("palindrome");
    }
    else
    {
      System.out.println("not a palindrom");
    }
}
}
