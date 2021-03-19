package JavaPractice;

public class AbstractChild extends AbstractParent {

  public void sound()
  {
    System.out.print("woof");
  }

  public static void main (String args[])
  {
    AbstractChild obj = new AbstractChild();

    obj.sound();
  }

}
