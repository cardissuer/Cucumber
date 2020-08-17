package opploans_task;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.List;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;

public class Opploans_task {
    public static void main(String[] args) throws JsonProcessingException {

        RestAssured.baseURI = "http://127.0.0.1";
        RestAssured.port = 8081 ;

        Response response = given().accept(ContentType.JSON).when().get("/products");
        response.then().log().all().statusCode(200);

//        ObjectMapper objectmapper = new ObjectMapper();
//        List <Product> listOfProducts = objectmapper.readValue(response.asString(), new TypeReference<List<Product>>() {
//        });
//        for (Product p: listOfProducts){
//            if(!p.manufacturer.isEmpty() || p.manufacturer!=null) {
//                System.out.println("Product " + p.name + " has price " + p.price + " and manufacturer " + p.manufacturer);
//            }
//            else{
//                System.out.println("Product " + p.name + " has price " + p.price + " and no manufacturer ");
//
//            }
//        }
//        }
        List<Product> list = response.as(new TypeRef<List<Product>>() {});
//        .then().log().all().statusCode(200)

        for(Product p:list){
            System.out.println(p.toString());
        }

        //JsonPath jsonPath = given().accept(ContentType.JSON).log().all().
        //  when().get("/products").jsonPath();

    }
        public class Product{
            private int id;
            private String name;
            private int updated_at;
            private int price;
            private String manufacturer;
            public Product(){}

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(int updated_at) {
                this.updated_at = updated_at;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public String getManufacturer() {
                return manufacturer;
            }

            public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
            }

            @Override
            public String toString() {
                String product="";
                if(!this.manufacturer.isEmpty() || this.manufacturer!=null) {
                    product = "Product " + name + " has price " + price + " and manufacturer " + manufacturer;
                }
                else{
                    product = "Product " + name + " has price " + price + " and no manufacturer ";
                }
                return product;
            }
        }
    }
