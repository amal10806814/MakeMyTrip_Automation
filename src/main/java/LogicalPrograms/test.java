package LogicalPrograms;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
    String s = "abadef" ;
    String sb = "   asdf";

        System.out.println(s.isEmpty());
        System.out.println(s.length());
        System.out.println(s.substring(3,6));
        System.out.println(s.substring(3));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.toUpperCase());
        System.out.println(sb.trim());



        String str = "hello world i am here";

        String[] b1= str.split("\\s" , 3);
        System.out.println(b1.length);
        for (String x: b1) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(b1));
        String xyz = "1001";
        int intVal2= 10002202;

        int v = Integer.parseInt(xyz);
        System.out.println(v);
        int intVal = Integer.valueOf(xyz);
        System.out.println(intVal);

        System.out.println(String.valueOf(intVal2) + "amal");
        System.out.println(Integer.toString(intVal2));

        Integer wer = new Integer(234);
        String wqw = Integer.toString(wer);
        System.out.println(wqw);

    }
    }
