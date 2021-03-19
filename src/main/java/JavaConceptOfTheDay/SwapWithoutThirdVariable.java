package JavaConceptOfTheDay;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {

        String a = "amal";

        String b = "chaudhary";

        a = a +b ;

        b = a.substring(0 , a.length()-b.length()); //swapping done

        a = a.substring(b.length());


        System.out.println(b);
        System.out.println(a);
    }
}
