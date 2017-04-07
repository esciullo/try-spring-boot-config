package prop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = { "spring.config.location = classpath:viaenvironment.yaml" })
public class SamplePropertyLoadingTestWithTestPropertySource {

  @Autowired
  private TheMapProperties theMapProperties;

  @Test
  public void testLoadingOfProperties() {
    System.out.println(theMapProperties);
  }
}
