package prop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleWebApplication.class)
//@PropertySource(value  = { "locations=classpath:/viaenvironment.yml" })
@ContextConfiguration(initializers = YamlFileApplicationContextInitializer.class)
//@SpringApplicationConfiguration(classes = Application.class, initializers = YamlFileApplicationContextInitializer.class)
public class SamplePropertyLoadingTestWithContextConfiguration {

  @Autowired
  private TheMapProperties theMapProperties;

  @Test
  public void testLoadingOfProperties() {
    System.out.println(theMapProperties);
  }
}
