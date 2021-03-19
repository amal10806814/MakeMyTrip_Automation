package JavaPractice;

import java.util.Scanner;

public class primenumber {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    System.out.println("enter number");

    int no = scn.nextInt();

    for (int i = 2; i < no; i++) {

      if (no % 2 == 0) {
        System.out.println("not a prime no");

        break;
      } else {

        System.out.println("prime no");
        break;
      }
    }
  }
}