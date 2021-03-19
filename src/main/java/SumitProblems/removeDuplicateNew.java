package SumitProblems;

public class removeDuplicateNew {
    public static void main(String[] args) {

        String str = "amalchaudhary"; //

            String result = "";

            for(int i = 0 ; i < str.length() ; i++)
            {
                if(result.contains(String.valueOf(str.charAt(i))))
                {
                    continue;
                }
            else
                {
                   result = result.concat(String.valueOf(str.charAt(i)));
                }
            }
        System.out.println(result);
    }
}
