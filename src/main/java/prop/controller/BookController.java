package prop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @RequestMapping("/book")
  public String index() {
    logger.info("book");
    return "BookController#book";
  }

}
