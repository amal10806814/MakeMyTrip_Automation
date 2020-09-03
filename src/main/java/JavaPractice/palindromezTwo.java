package JavaPractice;

public class palindromezTwo {

    public static void main(String[] args) {
        String str = "nitin" ;
        int a = str.length()-1;

        for (int i =0; i<=a; i++ ) {
            if (str.charAt(i) != str.charAt(a - i)) {
                System.out.println("not palindrome");
                break;
            }

        }
        System.out.println(" palindrome");
    }
}
