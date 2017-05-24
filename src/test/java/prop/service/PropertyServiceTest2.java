package prop.service;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import prop.utils.StringUtil;

@RunWith(PowerMockRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@PrepareForTest(StringUtil.class)
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@TestPropertySource(properties = { "spring.config.location = classpath:viaenvironment.yaml" })
@PowerMockIgnore("javax.management.*")
public class PropertyServiceTest2 {

  @Autowired
  private PropertyService propertyService;

  @Test
  public void test() {

    PowerMockito.mockStatic(StringUtil.class);
    when(StringUtil.getStr()).thenReturn("StringUtil#MockString");
    System.out.println(propertyService.get());
  }
}
