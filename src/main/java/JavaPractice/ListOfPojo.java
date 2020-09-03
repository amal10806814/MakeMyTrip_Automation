package JavaPractice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ListOfPojo implements Serializable {
@JsonProperty("")
  private List<JsonPojo> jsonPojoList;

  public List<JsonPojo> getJsonPojoList() {
    return jsonPojoList;
  }

  public void setJsonPojoList(List<JsonPojo> jsonPojoList) {
    this.jsonPojoList = jsonPojoList;
  }
}
