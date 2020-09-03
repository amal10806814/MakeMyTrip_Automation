package JavaConceptOfTheDay;


import java.util.Scanner;

public class UserInputIsNumberOrNot {

    public static Boolean numberOrNot(String s)
    {
        try{
            Integer.parseInt(s);
        }
        catch (NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(numberOrNot("1234"));

    }
}
