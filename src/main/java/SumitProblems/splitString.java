package SumitProblems;

public class splitString {
    public static void main(String[] args) {
        String s = "my name is amal.";

        String[] str = s.split("\\s+");

        String temp = "";
        for(int i=3;i>=0; i--)
        {

            temp  = temp + str[i] ;
        }

        s= temp ;
        System.out.println(s);
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.length());

        sb.deleteCharAt(4);
        sb.append('.');
        System.out.println(sb);

    }
}
