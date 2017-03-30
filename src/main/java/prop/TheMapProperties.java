package prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * <pre>
 * </pre>
 */
@Data
@Component
@ConfigurationProperties("map")
public class TheMapProperties {
  private HashMap<String, ConvertSetting> mappingMap;
}
