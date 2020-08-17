package api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.Data;
import org.junit.Test;


@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class    jacksonTest {

        @Test
        public void jackson() throws Exception {
            Teacher teacher = new Teacher();
            teacher.setEmailAddress("json@gmail.com");
            teacher.setFirstName("Jennifer");
            //teacher.setLastName("Lawrence");
            teacher.setJoinDate("03/16/2020");
            teacher.setSalary(5000);
            ObjectMapper objectMapper = new ObjectMapper();
            String teacherJson = objectMapper.writeValueAsString(teacher);
            System.out.println(teacherJson);
        }

        @Test
        public void SubjectTest () throws JsonProcessingException {
        Subject subject = new Subject();
        Teacher teacher = new Teacher();
        subject.setBatch(14);
        subject.setName("Automation");
        subject.setYear(2020);
        ObjectMapper objectMapper = new ObjectMapper();
        String teacherJson = objectMapper.writeValueAsString(teacher);
        System.out.println(teacherJson);
        }

        @Test
        public void studentTest () throws Exception {
        company company = new company();
        address address = new address();
        address.setCity("Chicago");
        address.setState("Illinois");
        address.setZipCode(60618);
        contact contact = new contact();
        contact.setEmailAddress("jesus@gmail.com");
        contact.setPhone("8473002300");
        contact.setPremanentAddress("2700 S River Rd");
        student student = new student();
        student.setBatch(14);
        student.setBirthDate("02/16/1977");
        student.setFirstName("John");
        student.setCompany(company);
        student.setContact(contact);
        ObjectMapper objectMapper = new ObjectMapper();
        String studentJson = objectMapper.writeValueAsString(student);
        System.out.println(studentJson);
        }

        @Test
        public void studentGet () throws JsonProcessingException {
            student students = new student();
            Response response = RestAssured.get("http://api.cybertektraining.com/student/6842");
            System.out.println(response.asString());
            ObjectMapper objectMapper = new ObjectMapper();
            ResponseBody rb = objectMapper.readValue(response.asString(), ResponseBody.class);
            String fName =rb.getStudents().get(0).getFirstName();
            System.out.println(fName);
        }
}