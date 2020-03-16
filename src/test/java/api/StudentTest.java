package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import okhttp3.ResponseBody;
import org.junit.Test;

public class StudentTest {

    @Test
    public void jobFoundTest () throws Exception{
        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        System.out.println(response.statusCode());
        System.out.println(response.asString());

        ObjectMapper objectMapper = new ObjectMapper();
        responseBody responseBody = objectMapper.readValue(response.asString(), api.responseBody.class);

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
