package JavaConceptOfTheDay;

import java.util.Arrays;

public class SumOfAllDigitOfANumber {
    public static void main(String[] args) {

        int a = 23457;

        int sum = 0;

        while(a!=0) {
            int b = a % 10; //2

            a = a / 10; //0

            {
                sum = sum + b; //14
            }
        }
        System.out.println(sum);
    }
}
