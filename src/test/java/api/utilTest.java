package api;

import org.junit.Assert;
import org.junit.Test;
import utilities.APIUtil;

public class utilTest {

    @Test
    public void TeacherTesting (){
        String resource = "/teacher/2192/";
        APIUtil.hitGET(resource);
        System.out.println(APIUtil.getResponseBody().getTeachers().get(0).getFirstName());
    }

    @Test
    public void allTeachersTest (){
        APIUtil.hitGET("/teacher/all");

        for (Teacher t: APIUtil.getResponseBody().getTeachers()){
            if (t.getGender().equalsIgnoreCase(("female"))){
                System.out.println(t.getFirstName());
            }
        }
    }

    @Test
    public void StudentsBetween () {
        APIUtil.hitGET("/student/all");
        int index = 0;
        for (student s : APIUtil.getResponseBody().getStudents()) {
            if (s.getBatch() >= 7 && s.getBatch() <= 14) {
                index++;
                continue;
            }
            Assert.fail("Student batch failed at: " + index);
            System.out.println(s.getFirstName());
            System.out.println("Batch" + s.getBatch());
            System.out.println();
        }
    }

    @Test
    public void postTesting (){
        RequestBody requestBody = new RequestBody();
        requestBody.setEmailAddress("jb2020@gmail.com");
        requestBody.setFirstName("Josh");
        requestBody.setLastName("Hylland");
        requestBody.setJoinDate("02/02/2015");
        requestBody.setSalary(5000);
        requestBody.setBatch(12);
        requestBody.setDepartment("Maths");
        requestBody.setBirthDate("02/02/1964");
        requestBody.setPhone("8472456234");
        requestBody.setPremanentAddress("5600 Addison Rd");
        requestBody.setPassword("Test");
        requestBody.setSubject("Jesus");
        requestBody.setGender("Male");
        requestBody.setSection("Pilots");
        //requestBody.setTeacherId(2220);
        APIUtil.hitPOST("/teacher/create", requestBody);
    }
}
