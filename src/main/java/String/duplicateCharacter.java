package String;

public class duplicateCharacter {
    public static void main(String[] args) {

        String s = "deepanshu";

        for (int i = 0 ; i <s.length(); i++)
        {
            int temp = 0;
            for(int j = 1 ; j < s.length() ; j++)
            {
            if (s.charAt(i) == s.charAt(j))
                {
                temp = temp + 1;
                }
        }
        }
    }
}
