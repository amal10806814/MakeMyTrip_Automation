package JavaPractice;

public class Stringbuffer {

  public static void main(String[] args) {

    StringBuffer str = new StringBuffer("     ");

    System.out.println(str.length());
    str.append(System.lineSeparator());

    str.append("chaudhary");

    System.out.println(str);
  }

}
