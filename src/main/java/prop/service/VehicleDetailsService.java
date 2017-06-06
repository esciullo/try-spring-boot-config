package prop.service;

import org.springframework.beans.factory.annotation.Autowired;
import prop.TheMapProperties;
import prop.utils.StringUtil;

public class VehicleDetailsService {
  @Autowired
  private TheMapProperties theMapProperties;

  public String get() {
    return theMapProperties.getMappingMap().keySet().toString() + StringUtil.getStr();
  }
}
