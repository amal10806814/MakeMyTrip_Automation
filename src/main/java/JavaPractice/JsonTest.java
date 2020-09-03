package JavaPractice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class JsonTest {

  public static void main(String[] args) throws IOException {

    //FileInputStream fis = new FileInputStream("D:\\PracticeAutomation\\src\\main\\java\\Resources\\mapperLog.log");

    File fis = new File("D:\\PracticeAutomation\\src\\main\\java\\Resources\\mapperLog.log");
    String string = FileUtils.readFileToString(fis);

    //System.out.println(string);


    String[] items = string.split("\n");

    String jsonArrayString = Arrays.toString(items);

    ObjectMapper objectMapper = new ObjectMapper();

    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    List<JsonPojo> obj = new ArrayList<>();
    try {
      obj = objectMapper.readValue(jsonArrayString, new TypeReference<List<JsonPojo>>() {
      });
    } catch (IOException e1) {
      e1.printStackTrace();
    }

    for (JsonPojo jsonPojo : obj)
    {
      if(jsonPojo.getMessage().equals("[Mapper call] | [START]"))
      //if(jsonPojo.getTimeStamp().equals("2018-10-24T17:20:14.762+05:30"))
      {
        System.out.println(jsonPojo.getTimeStamp());
      //  System.out.println(jsonPojo.getMessage());
        break;
      }
    }

  }
}
