package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.Config;

public class TeacherAPI {

    @Test
    public void departmentName (){
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/department/Computer");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        JsonPath jsonPath = response.jsonPath();
        int size = jsonPath.getList("teachers").size();
        for(int i = 0; i< size; i++){
            String path = "teachers[" + i + "].department";
            String dept = jsonPath.get(path);
            System.out.println(dept);
            Assert.assertEquals("Department failed at" + i,"Computer", dept);
        }
    }

    @Test
    public void emailValidationTeacherAPI () throws JsonProcessingException {
        Response response = RestAssured.get(Config.getProperty("baseURL") + "/teacher/all");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        Assert.assertEquals("List of Teachers API failed", 200, response.statusCode());
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseBody rb = objectMapper.readValue(response.asString(), ResponseBody.class);
        System.out.println(rb.getTeachers().size());
        for (int i=0; i<rb.getTeachers().size();i++){
            String email = rb.getTeachers().get(i).getEmailAddress();
            if (email.contains("@") && email.contains(".")){
                continue;
            } else
                System.out.println(email);
        }
    }

    @Test
    public void createTeacherTest () throws JsonProcessingException {
        Teacher teacher = new Teacher();
        teacher.setEmailAddress("jb2020@gmail.com");
        teacher.setFirstName("James");
        teacher.setLastName("Bond");
        teacher.setJoinDate("02/02/2017");
        teacher.setSalary(5000);
        teacher.setDepartment("Maths");
        teacher.setBirthDate("02/02/1964");
        teacher.setPhone("8472456234");
        teacher.setPremanentAddress("5600 Addison Rd");
        teacher.setPassword("Test");
        teacher.setSubject("Jesus");
        teacher.setGender("Male");
        teacher.setSection("Pilots");
        teacher.setTeacherId(2171);

        ObjectMapper objectMapper = new ObjectMapper();
        String teacherJson = objectMapper.writeValueAsString(teacher);
        System.out.println(teacherJson);

        Response response = RestAssured.given().contentType(ContentType.JSON).body(teacherJson).when().post(Config.getProperty("baseURL") + "/teacher/create");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
    }

    @Test
    public void updateTeacher () throws Exception{
        Teacher teacher = new Teacher();
        teacher.setEmailAddress("jb2020@gmail.com");
        teacher.setFirstName("James");
        teacher.setLastName("Bond");
        teacher.setJoinDate("02/02/2017");
        teacher.setSalary(5000);
        teacher.setDepartment("Maths");
        teacher.setBirthDate("02/02/1964");
        teacher.setPhone("8472456234");
        teacher.setPremanentAddress("5600 Addison Rd");
        teacher.setPassword("Test");
        teacher.setSubject("Jesus");
        teacher.setGender("Male");
        teacher.setSection("Pilots");
        teacher.setTeacherId(2181);
        ObjectMapper objectMapper = new ObjectMapper();
        String teacherJson = objectMapper.writeValueAsString(teacher);
        Response response = RestAssured.given().contentType(ContentType.JSON).body(teacherJson).put(Config.getProperty("baseURL") + "/teacher/update/");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
    }
}