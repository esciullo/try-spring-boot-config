package prop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan
public class SampleWebApplication {

  public static void main(String[] args) {

    new SpringApplicationBuilder(SampleWebApplication.class)
        .properties("spring.config.name:application", "spring.config.location=classpath:/viaenvironment.yaml").build()
        .run(args);
  }
}
