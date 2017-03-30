package prop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleWebApplication.class)
public class SamplePropertyLoadingTest {

  @Autowired
  private TheProperties theProperties;
  
  @Autowired
  private TheMapProperties theMapProperties;
  
  
  @Test
  public void testLoadingOfProperties() {
    System.out.println(theProperties);
    System.out.println(theMapProperties);
  }
}
