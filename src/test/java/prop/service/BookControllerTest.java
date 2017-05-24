package prop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BookControllerTest {
  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void test() {

    ResponseEntity<String> resp = this.restTemplate.getForEntity("/{username}", String.class, "book");

    System.out.println("status:" + resp.getStatusCode());
    System.out.println("header:" + resp.getHeaders());
    System.out.println("body:" + resp.getBody());

  }
}
