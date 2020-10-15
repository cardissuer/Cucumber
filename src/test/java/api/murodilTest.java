package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.Config;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class murodilTest {

    @Test
    public void pathOption () {
        Response response = given().log().all().accept(ContentType.JSON)
                .and().pathParam("id", 10)
                .when().get("/spartans/{id}");
        System.out.println(response.body().path("id").toString());
        System.out.println(response.path("gender").toString());

        //assert values
        Assert.assertEquals("gender", "weak", "parameter isn't true");

        //extract all phone numbers
        List<Long> phoneNumbers = response.path("numbers");
        for (Long ph : phoneNumbers) {
            System.out.println(ph);
        }
    }
        @BeforeTest
        public void pathParamOption () {
            RestAssured.baseURI = Config.getProperty("something");
        }
            @Test
            public void pathParam_retrieve_country (){

            Response response =    given().accept("application-json")
                                    .and().pathParam("country_id", "US")
                                    //.queryParam("q", "{\"region/id}\":2")
                                    .when().get("/countries/{country_id}");

            int statusCode = response.statusCode();
            String countryID = response.path("country_id");
            String countryName = response.path("country_name");
            int regionID = response.path("region_id");

            Assert.assertEquals (statusCode,200);
            Assert.assertEquals (countryID, "US");
            Assert.assertEquals(countryName, "United States of America");
            Assert.assertEquals(regionID, 2);
        }

        @Test
        public void queryParamOption (){

        Response response = given().accept("application-json")
                             .and().queryParam("/q", "{\"department_id\":80}")
                             . when(). get("/employees");

        Assert.assertEquals(response.statusCode(), 200);
        List <String> jobIDs = response.path ("items.job_id");
        List <Integer> deptIds = response.path("items.department_id");
        int count = response.path("count");

        for (String jobID: jobIDs){
            Assert.assertTrue(jobID.startsWith("SA"));
            Assert.assertEquals(jobID.substring(0,2), "SA");
        }
        deptIds.forEach(id ->Assert.assertEquals(Integer.valueOf(80), id));
        Assert.assertEquals(count,25);

        }

        @Test
        public void jsonPathUsing (){
        Response response = given().accept(ContentType.JSON)
                            .and().pathParam("id",10)
                            .when().get("/classes");

        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals (response.contentType(), "application/json;charset=UTF-8");

            JsonPath json = response.jsonPath();
            JsonPath json2 = new JsonPath(response.body().asString());
            int id = json.getInt("name");
            String gender = json.getString("gender");
            Long phone = json.getLong("phone");

            System.out.println("phone = " + phone);
            System.out.println("gender = " + gender);
            System.out.println("id = " + id);

            JsonPath jsonData = get ("www.linkedin.com/student/58021").jsonPath();
            String firstName = jsonData.getString("students.firstname");
            String lastName = jsonData.getString("students.lastname");
            String phonE = jsonData.getString("students.contact.phone");
            String email = jsonData.getString("students.contact.email");
            String companyName = jsonData.getString("students.company.companyName");
            String companyCity = jsonData.getString("students.company.companyCity");

        }

        @Test
        public void getJsonPathApi (){

        JsonPath json = get("www.linkedin.com/ords/countries").jsonPath();
        json.prettyPrint();

        List <String> countryNames = json.getList("items.country_name");

        }

        @Test
        public void usingHamcrest () {
            given().accept(ContentType.JSON)
                    .and().pathParam("id", 15)
                    .when().get("www.linkedin.com/api/{id}")
                    .then().assertThat().statusCode(200)
                    .and().assertThat().contentType("application/json"); 
                    //.and().assertThat().body("id",  );

        }

        @Test
        public void mappingJson (){

        Response response = given().accept(ContentType.JSON)
                            .pathParam("employee_id", 15)
                            .when().get("www.linkedin.com/employees/{employee_id}");

        Map<String, Object> employeeMap = response.body().as(Map.class);
        System.out.println(employeeMap.toString());

        String employeeFirstName = employeeMap.get("firstName").toString();
        Assert.assertEquals(employeeFirstName, "David");
        
        }
    }