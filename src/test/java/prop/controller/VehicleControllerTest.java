package prop.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import prop.service.VehicleDetailsService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class VehicleControllerTest {
  @Autowired
  private TestRestTemplate restTemplate;
  
  @MockBean
  private VehicleDetailsService vehicleDetailsService;
  
  private static String mock = "mock vehicleDetailsService";
  
  @Before
  public void setup() {
      when(this.vehicleDetailsService.get()).thenReturn(mock);
  }
  
  @Test
  public void test() {

    ResponseEntity<String> resp = this.restTemplate.getForEntity("/{username}", String.class, "vehicle");

    System.out.println("status:" + resp.getStatusCode());
    System.out.println("header:" + resp.getHeaders());
    System.out.println("body:" + resp.getBody());

    assertThat(resp.getBody()).isEqualTo(mock);
  }
}
