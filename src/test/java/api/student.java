package api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.junit.Ignore;

@Data
@JsonInclude (JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class student {

    private String firstName;
    private String lastName;
    private int batch;
    private String joinDate;
    private String birthDate;
    company company;
    contact contact;

}
