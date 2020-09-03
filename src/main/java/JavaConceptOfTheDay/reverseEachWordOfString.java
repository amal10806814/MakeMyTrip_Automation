package JavaConceptOfTheDay;

public class reverseEachWordOfString {
    public static void main(String[] args) {

        String s1 = "Java Concept Of The Day";

        String[] s2 = s1.split(" ");
        String reverse = "";
        String result = "";

        for (int i = 0; i < s2.length; i++)
        {
            String word1 = s2[i];

            for (int j = word1.length()-1 ; j>=0  ; j--)
            {
                reverse = reverse + word1.charAt(j) ; //avaj
            }
                reverse = reverse + " ";
        }

        System.out.println(reverse);
    }
}
