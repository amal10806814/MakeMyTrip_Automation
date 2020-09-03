package SumitProblems;

public class InternString {
    public static void main(String[] args) {

        String s1 = new String("amal");
        String  s2 = "amal";
        String s3 = "amal";

        String s4 = s1.intern(); //it will return the reference from SCP

        System.out.println(s3==s4);
    }
}
