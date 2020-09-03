package JavaConceptOfTheDay;

public class StringImmutable {
    public static void main(String[] args) {

        String s = "hello";

        s.concat("amal");

        System.out.println(s);


        StringBuffer sb = new StringBuffer("hello");

        sb.append("world");
        System.out.println(sb);

    }
}
