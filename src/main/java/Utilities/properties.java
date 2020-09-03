package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {

  public properties() throws IOException {

        Properties prop = new Properties();

        FileInputStream fis = new FileInputStream("D:\\PracticeAutomation\\src\\main\\java\\Resources\\config.properties");

        prop.load(fis);

        String a = prop.getProperty("url");
        System.out.println(a);
        System.out.println("hello");
    }
}