package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class callingpropertymethod {
  callingpropertymethod call;
  public static Properties prop;

  public void setproperties() throws IOException {
    Properties prop = new Properties();
    FileInputStream fis = new FileInputStream("D:\\PracticeAutomation\\src\\main\\java\\Resources\\config.properties");
    prop.load(fis);
    System.out.println(prop.getProperty("url"));
  }

  public String geturlMethod() throws IOException {
    return prop.getProperty("url");
  }


}