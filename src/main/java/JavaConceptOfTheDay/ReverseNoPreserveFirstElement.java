package JavaConceptOfTheDay;

public class ReverseNoPreserveFirstElement {

    public static void main(String[] args) {

        String s1 = "Chandigarh is the capital of haryana";

        System.out.println(s1);

        String [] s2 =  s1.split(" ");

        String sum1 ="";

        for(int i = 0 ; i < s2.length ; i++) {

           char [] ch = s2[i].toCharArray();

            String sum = String.valueOf(ch[0]);
            for (int j = ch.length - 1; j > 0; j--)
            {
                sum = sum + ch[j];
            }
            sum1 = sum1 +" "+sum ;
        }

        System.out.println(sum1);
    }
}
