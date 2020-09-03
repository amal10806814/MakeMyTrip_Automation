package JavaPractice;

import java.io.IOException;

public class Throws_Class {

  public void method(int num) throws IOException,ClassNotFoundException{
    if (num==1) throw new IOException("IO Exception Occured");

    else throw new ClassNotFoundException("class not found exception");

  }

}
