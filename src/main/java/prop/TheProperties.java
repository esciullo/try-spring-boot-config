package prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

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

  private HashMap<String, String> mappingMap;

  private List<String> servers;
}