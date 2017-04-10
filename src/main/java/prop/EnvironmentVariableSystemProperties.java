package prop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * </pre>
 */
@Data
@Component
public class EnvironmentVariableSystemProperties {

  @Value("${java.home}")
  private String javaHome;
  
  @Value("${DATASTORE.DATASET}")
  private String datastoreDataset;
  
  @Value("${spring.config.name:defaultSpringConfigName}")
  private String springConfigName;
  
}
