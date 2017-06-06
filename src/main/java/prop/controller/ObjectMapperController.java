package prop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prop.entity.TestReq;

import javax.validation.Valid;

@RestController
public class ObjectMapperController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @RequestMapping("/objectmappertest")
  public String index(@Valid TestReq req) {
    logger.info(req.toString());
    return "test";
  }
}
