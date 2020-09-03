package JavaPractice;

import java.util.Scanner;

public class RemoveSpace {

  public static void main (String args[])
  {

    Scanner scan = new Scanner(System.in);

    System.out.println("enter string");

    String word = scan.next();

    word = word.replaceAll("" , "");

    System.out.print(word);
  }

}
