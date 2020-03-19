package utilities;

import api.RequestBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import api.ResponseBody;
import org.junit.Assert;

public class APIUtil {

    //CRUD Operation. One method should handle any API we are hitting. One method for each operation.
    private static ResponseBody responseBody;

    public static void hitGET (String resource) {
        String uri = Config.getProperty("baseURL") + resource;
        Response response = RestAssured.get(uri);
        System.out.println(response.asString());
        Assert.assertEquals("GET API hit failed", 200, response);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (Exception j) {
            j.printStackTrace();
        }
    }

    public static ResponseBody getResponseBody (){
        return responseBody;
    }

    public static void hitPOST (String resource, RequestBody body){
        String uri = Config.getProperty("baseURL") + resource;
        ObjectMapper objectMapper = new ObjectMapper();
        String bodyJson = "";
        try {
            bodyJson = objectMapper.writeValueAsString(body);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        Response response = RestAssured.given().contentType(ContentType.JSON).body(bodyJson).when().post(uri);
        System.out.println(response.asString());
        Assert.assertEquals("Hit Post is failed", 200, response);
        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (Exception j) {
            j.printStackTrace();
        }
    }
}
