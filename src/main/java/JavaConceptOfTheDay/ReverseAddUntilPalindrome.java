package JavaConceptOfTheDay;

public class ReverseAddUntilPalindrome {

    public static int reverseMethod(int number)
    {
        String s1 = String.valueOf(number);

        String s2 = "";

        for(int i = s1.length()-1; i>=0; i--)
        {
            s2 = s2 + s1.charAt(i);
        }

        int reverse = Integer.parseInt(s2);
        return reverse ;
    }

    public static boolean ispalinDrome(int number)
    {
       int reverseFirst = reverseMethod(number);
        if(number==reverseFirst)
        {
            System.out.println("palindrome");
            return true;
        }

        else
        {
            return false;
        }

    }

    public static int addNumber(int number) //1234
    {
        while (!ispalinDrome(number))
        {
            number= number + reverseMethod(number); //1234+4321 =5555
        }
        return number;

    }

    public static void main(String[] args) {
        System.out.println(addNumber(98765));
    }


}
