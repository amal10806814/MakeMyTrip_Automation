package JavaConceptOfTheDay;

public class ReverseNaddUntilPalindrome {

public static int reverseMethod(int number) {
    String s1 = String.valueOf(number);
    String result = "";
    for (int i = s1.length() - 1; i >= 0; i--) {
        result = result + s1.charAt(i);
    }
     int rev = Integer.parseInt(result);
    return rev;
    }

    public static boolean isPalindrome(int number)
    {
        int reverseNo = reverseMethod(number);

        if(number==reverseNo)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void ReverseAddPalindrome(int number)
    {
        if(isPalindrome(number))
        {
            System.out.println("no is already palindrome");
        }

        else {
            while (!isPalindrome(number)) {
                int rev = reverseMethod(number);

                int sum = number + rev;

                System.out.println(number +" +"+ rev + "=" + sum);

                number = sum;
            }
        }
    }


    public static void main(String[] args)
        {
       ReverseAddPalindrome(1784);
    }
}
