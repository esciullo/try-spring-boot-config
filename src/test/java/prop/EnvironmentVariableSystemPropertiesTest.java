package prop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <pre>
 * </pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleWebApplication.class)
public class EnvironmentVariableSystemPropertiesTest {

  @Autowired
  private EnvironmentVariableSystemProperties environmentVariableSystemProperties;

  @Test
  public void testLoadingOfProperties() {
    System.out.println(environmentVariableSystemProperties);
  }
}
