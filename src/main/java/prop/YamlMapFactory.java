package prop;

import org.springframework.beans.factory.config.YamlMapFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * <pre>
 * 
 * </pre>
 */
@Component
public class YamlMapFactory {
  
  private Map<String, Object> obj = null;
  
  public YamlMapFactory(){
    YamlMapFactoryBean yamlMapFactoryBean = new YamlMapFactoryBean();
    yamlMapFactoryBean.setResources(new ClassPathResource("config.yaml"));
    obj = yamlMapFactoryBean.getObject();
    System.out.println("Create YamlMapFactory");
  }
  
  public Map<String, Object> getObj(){
    return obj;
  }
  

}
