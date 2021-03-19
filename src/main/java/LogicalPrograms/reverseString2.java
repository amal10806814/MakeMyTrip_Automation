package LogicalPrograms;

public class reverseString2 {

    public static void main(String[] args) {

        String s = "amazon";
        char[] c = s.toCharArray();
        char temp ;

        for(int i = 0 ; i < c.length/2 ; i ++)
        {
           temp = c[i];
           c[i]= c[c.length -1 -i];
           c[c.length-1 -i] = temp;
        }

        for (int i = 0; i < c.length ; i++)
        {
            System.out.println(c[i]);
        }
        String str = String.valueOf(c);
        System.out.println(str);
    }
}
