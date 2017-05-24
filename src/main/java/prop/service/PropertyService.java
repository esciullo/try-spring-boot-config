package prop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import prop.TheMapProperties;
import prop.utils.StringUtil;

@Component
public class PropertyService {

  @Autowired
  private TheMapProperties theMapProperties;

  public String get() {
    return theMapProperties.getMappingMap().keySet().toString() + StringUtil.getStr();
  }
}
