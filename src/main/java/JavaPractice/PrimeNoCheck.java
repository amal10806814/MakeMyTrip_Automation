package JavaPractice;

import java.util.Scanner;

public class PrimeNoCheck {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);
        System.out.println("Enter no");
        int s = b.nextInt();

        for (int i = 2; i <= s; i++) {
            if (s % i == 0) {
                if (s == i) {
                    System.out.println("prime no");
                    break;
                }
                System.out.println("not prime ");
                break;
            }
        }
    }
}

