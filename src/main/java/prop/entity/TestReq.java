package prop.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@Data
@ToString
public class TestReq {
  @NotBlank
  private String name;
}
