package prop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prop.service.VehicleDetailsService;

@RestController
public class VehicleController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private VehicleDetailsService vehicleDetailsService;
  
  @RequestMapping("/vehicle")
  public String index() {
    logger.info("vehicle");
    
    return vehicleDetailsService.get();
  }
}
