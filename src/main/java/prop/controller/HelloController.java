package prop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prop.TheMapProperties;

@RestController
public class HelloController {

  @Autowired
  private TheMapProperties theMapProperties;

  @RequestMapping("/")
  public String index() {
    System.out.println(theMapProperties);
    
    return "Greetings from Spring Boot!";
  }

}
