package prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <pre>
 * </pre>
 */
@Data
@Component
@ConfigurationProperties("myname") // locations = "mappingconfig.yaml")
public class TheProperties {
  private String name;

  private HashMap<String, String> mappingMap;// = new HashMap<String, String>();

  private List<String> servers;// = new ArrayList<String>();

//  public List<String> getServers() {
//    return this.servers;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public Map<String, String> getMappingMap() {
//    return mappingMap;
//  }
}
