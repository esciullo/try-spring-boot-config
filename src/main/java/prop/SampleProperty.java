package prop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@ConfigurationProperties(locations = "mappingconfig.yaml", prefix = "prefix")
@Component
@Data
public class SampleProperty {
    @Value("${elasticsearch.specifiedindex}")
    private String specifiedindex;
}
