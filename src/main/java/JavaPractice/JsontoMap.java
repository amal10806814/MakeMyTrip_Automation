package JavaPractice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JsontoMap {

  public static <object> void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("D:\\PracticeAutomation\\src\\main\\java\\Resources\\mapper.json");

    // String json = "{\"id\":1,\"name\":\"amla\",\"age\": 27 }";

    HashMap<String, Object> map = new HashMap<String, Object>();

     ObjectMapper mapper = new ObjectMapper();

    map = mapper.readValue(fis, new TypeReference<Map<String, Object>>(){});
     //  List<Map<String , Object>> data = mapper.readValue(fis , new TypeReference<List<Map<String, Object>>>(){});

    System.out.println(map.get("@timestamp"));
      //Object abc = data.get(5).get("message");
      //System.out.println(abc);

      //System.out.println(map);
      // System.out.println(map.get("@timestamp"));

      //map.getOrDefault("message" , "[Mapper call] | [START]");

      // System.out.println(map.containsValue("Test environment not initialized, so using LocalTestEnvironment"));

      // System.out.println(); map.containsKey("message");

      //System.out.println(map.get("message"));

      //if(map.containsValue("Test environment not initialized, so using LocalTestEnvironment"))
      //{

      //}

      //System.out.println(map.containsValue("[Mapper call] | [START]"));

      //map = mapper.readValue(fis, new TypeReference<Map<String, Object>>(){});

      List<HashMap<String, Object>> listofkeyvalues = new ArrayList<>();

      // listofkeyvalues.add(map);

      //listofkeyvalues.listIterator(44);

      Iterator<HashMap<String, Object>> iterator = listofkeyvalues.iterator();

      while (iterator.hasNext()) {
        Map<String, Object> message = iterator.next();

        Set<Entry<String, Object>> entryset = message.entrySet();

        for (Entry<String, Object> entry : entryset) {

          System.out.println(entry.getKey() + " " + entry.getValue());
        }
      }

    }
  }


