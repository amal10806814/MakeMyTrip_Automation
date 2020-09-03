package JavaPractice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Gsontest {

  public static void main(String[] args) {

    Gson  gson = new GsonBuilder().setLenient().create();
    //JsonParser parser = new JsonParser();
    try
    {
      Reader reader  = new FileReader("D:\\PracticeAutomation\\src\\main\\java\\Resources\\mapper.json");
      JsonElement json = gson.fromJson(reader , JsonElement.class);
      String ah = gson.toString();
      System.out.println(ah);
     // Object obj = parser.parse(new FileReader("D:\\PracticeAutomation\\src\\main\\java\\Resources\\mapper.json"));
     // JsonObject jsonObject = (JsonObject) obj;
      //System.out.println(jsonObject);
    }

    catch (IOException e)
    {
    e.printStackTrace();
    }
  }

}
