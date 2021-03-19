package String;

public class Anagram {
    public static void main(String[] args) {
        String str = "amal";
        char[] c = str.toCharArray();
        String str1 = "amla";
        char[] c1 = str1.toCharArray();

        for(int i = 0 ; i < 4 ; i ++)
        {
            for(int j = 0 ; j< 4 ; j++)
            {
                if(c[i]==c[j])
                {
                    break;
                }
            }
        }
        System.out.println("both no are anagram");
    }
}
