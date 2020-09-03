package JavaPractice;

public class stringCharAt_Class {

  public static void main(String[] args) {

    String str = "hello my name is Amal Chaudhary";

      //Character charact = str.charAt(0);

    int counter = 0;

      for (int i= 0 ; i<=str.length()-1 ; i++)
      {
       if (str.charAt(i)=='a')
       {
        counter++  ;
       }
      }
    System.out.println("print occurence of a" + counter);


  }

}
