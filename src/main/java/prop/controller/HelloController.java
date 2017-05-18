package prop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prop.SampleProperty;
import prop.TheMapProperties;

@RestController
public class HelloController {

  @Autowired
  private TheMapProperties theMapProperties;
  
  @Autowired
  private SampleProperty sampleProperty;

  @RequestMapping("/")
  public String index() {
    System.out.println(theMapProperties);
    System.out.println("sampleProperty" + sampleProperty);

    return "Greetings from Spring Boot!";
  }

}
