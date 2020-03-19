package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class TeacherTest {

        @Test
        public void teacherEmailVerification () throws Exception{
            Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");
            System.out.println(response.statusCode());
            System.out.println(response.asString());
            ObjectMapper objectMapper = new ObjectMapper();
            ResponseBody responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
            int counter = 0;
            for (student student:  responseBody.getStudents()){
                if (student.getCompany().getStartDate().endsWith("2020")){
                    System.out.println(student.getFirstName());
                    counter++;
                }
            }
            System.out.println("\nCount" + counter);
        }
    }