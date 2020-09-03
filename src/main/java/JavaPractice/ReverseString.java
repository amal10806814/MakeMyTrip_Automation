package JavaPractice;

import java.util.Scanner;

public class ReverseString
{

  public static void main (String args[])
  {
    Scanner scan = new Scanner (System.in);

    System.out.print("enter number");

    Integer x = scan.nextInt();

    String strnew = x.toString();

    System.out.println("converted to string:" +" "+strnew);

    char[] a = strnew.toCharArray();
    //System.out.println(a);

    int i = a.length;
    //System.out.println(i);

    for (int y =i-1 ; y>=0 ; y--)
    {
      System.out.println("string reversed:"+" "+ a[y]);
    }

    Integer new1 = Integer.parseInt(strnew);

    System.out.println("converted to Integer again :" + " "+new1);
   /* char[] a = x.toCharArray();

    int t = a.length;

    for ( int i =t-1; i>=0; i--)
    {
      System.out.print(a[i]);
    }
    String str = new String(a);
    System.out.println(str);
    */


  }
}
