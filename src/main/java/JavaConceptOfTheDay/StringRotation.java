package JavaConceptOfTheDay;

import java.util.ArrayList;

public class StringRotation {
    public static void main(String[] args) {

        String s1 = "JavaJ2eeStrutsHibernate";

        String s2= "HibernateJavaJ2eeStruts";

        if(s1.length()!= s2.length())
        {
            System.out.println("s1 and s2 length didnt match");
            return;
        }

        else {

            String s3 = s1 + s2;

            if(s3.contains(s2))
            {
                System.out.println("rotation");
            }
            else
            {
                System.out.println("not rotated");
            }
        }

    }
}
