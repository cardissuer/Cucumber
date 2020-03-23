package api;

import org.junit.Test;
import utilities.APIUtil;

public class lastAPI {

    @Test
    public void teacherDeletePositive (){
        String resource = "/teacher/delete/2708";
        APIUtil.hitDelete(resource);
        String resourceForGet = "teacher/2708";
        APIUtil.hitGET(resourceForGet);
        String message = APIUtil.getResponseBody().getMessage();
    }

    @Test
    public void teacherDeleteNegative (){
        String resource = "/teacher/delete/2708";
        APIUtil.hitDelete(resource);
        String message = APIUtil.getResponseBody().getMessage();
        System.out.println(message);
    }
}
