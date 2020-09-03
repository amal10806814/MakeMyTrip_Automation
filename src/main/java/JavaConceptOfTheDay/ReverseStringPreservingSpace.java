package JavaConceptOfTheDay;

public class ReverseStringPreservingSpace {
    public static void main(String[] args) {

        String s1 = "I Am Not String";

        char[] ch = s1.toCharArray();

        char[] ch1 = new char[ch.length];

        for (int i = 0 ; i < ch.length ; i++)
        {
            if(ch[i] == ' ')
            {
                ch1[i] = ' ';
            }
        }

        int j= ch.length-1;

        for(int i=0 ; i < ch.length ; i++)
        {
            if(ch[i]!= ' ')
            {
                if(ch1[j]==' ')
                {
                    j-- ;
                }
                ch1[j]= ch[i];
                j--;
            }
        }
        System.out.println(String.valueOf(ch1));
    }
}
