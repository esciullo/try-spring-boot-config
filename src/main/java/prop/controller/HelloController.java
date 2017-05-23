package prop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prop.SampleProperty;
import prop.TheMapProperties;
import prop.helpers.SpringLoggingHelper;

@RestController
public class HelloController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  
  @Autowired
  private TheMapProperties theMapProperties;
  
  @Autowired
  private SampleProperty sampleProperty;

  @RequestMapping("/")
  public String index() {
    System.out.println(theMapProperties);
    System.out.println("sampleProperty" + sampleProperty);

    logger.debug("This is a debug message");
    logger.info("This is an info message");
    logger.warn("This is a warn message");
    logger.error("This is an error message");
    new SpringLoggingHelper().helpMethod();
    
    return "Greetings from Spring Boot!";
  }

}
