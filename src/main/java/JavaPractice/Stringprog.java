package JavaPractice;

import java.util.Scanner;

public class Stringprog {

  public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
System.out.print("provide number");

String num = scan.next();

System.out.println(num);

char[] a = num.toCharArray();

//System.out.print(a[0]);

for (int i=0 ;i < a.length ; i++)
{
  System.out.println(a[i]);
}

  }

}
