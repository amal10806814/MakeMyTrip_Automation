package PracticeProject;

public class ContructorOverloadingNew {

  private int a  ;
  ContructorOverloadingNew()
  {
   a = 100;
  }

  ContructorOverloadingNew(int newA)
  {
    this();

    a = a + newA;
  }

  public void setvalue(int x)
  {
    this.a = x;
  }

  public int getvalue()
  {
    return a;
  }


  public static void main(String[] args) {

    ContructorOverloadingNew obj = new ContructorOverloadingNew(10);

    obj.setvalue(11);
    System.out.println(obj.getvalue());
    System.out.println(obj.a);
  }

}
