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
    private String password;
    private String phone;
    private String subject;
    private String gender;
    private String department;
    private String section;
    private String premanentAddress;
    private String birthDate;
    private int teacherId;
}