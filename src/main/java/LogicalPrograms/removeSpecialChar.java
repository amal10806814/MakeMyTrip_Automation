package LogicalPrograms;

public class removeSpecialChar {

    public static void main(String[] args) {

        String s = "@$$)@$$($)(helloAmal#@$$$$$";

        s = s.replaceAll("[^a-zA-Z0-9]" , "");

        System.out.println(s);
    }
}
