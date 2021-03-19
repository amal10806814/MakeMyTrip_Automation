package JavaPractice;

public class palindrome {

    public static void main(String[] args) {

        String str = "nitin" ;

        String rev = "";
            int a = str.length(); //5

        for(int i =a-1; i >=0 ; i--)
        {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);

        if( str.equals(rev))
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

}
