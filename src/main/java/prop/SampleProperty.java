package prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

//@ConfigurationProperties(locations = "mappingconfig.yaml", prefix = "prefix")
@Component
@Data
public class SampleProperty {
    private String stringProp1;
    private String stringProp2;
    @Max(99)
    @Min(0)
    private Integer intProp1;
    private List<String> listProp;
    private Map<String,  Map<String, String>> mapProp;
}
