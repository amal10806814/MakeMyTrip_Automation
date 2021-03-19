package JavaPractice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonPojo  implements Serializable {

  @JsonProperty("@timestamp")
  private String timeStamp;

  @JsonProperty("@version")
  private String version;

  private String message;

  private String logger_name;

  private String thread_name;

  private String level;

  private String level_value;

  public String getLevel_value() {
    return level_value;
  }

  public void setLevel_value(String level_value) {
    this.level_value = level_value;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public void setThread_name(String thread_name) {
    this.thread_name = thread_name;
  }

  public String getThread_name() {
    return thread_name;
  }

  public void setLogger_name(String logger_name) {
    this.logger_name = logger_name;
  }

  public String getLogger_name() {
    return logger_name;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }
}
