package api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


@Data
@JsonInclude (JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Teacher {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String joinDate;
    private int salary;
    Subject subject;
}