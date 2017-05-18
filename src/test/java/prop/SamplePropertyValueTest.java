package prop;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleWebApplication.class)
public class SamplePropertyValueTest {
  
  @Autowired
  private SampleProperty sampleProperty;

  @Test
  public void testLoadingOfProperties() {
    System.out.println(sampleProperty);
    
    assertThat("common",equalTo(sampleProperty.getSpecifiedindex()));
  }
}
