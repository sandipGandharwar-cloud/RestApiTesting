package pageObjects;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import pojo.CodeClass;

public class pageObjectClass {

    public void apiUrl(){
        String ResponseBody;
        RestAssured.baseURI = "https://gorest.co.in/public-api/users";
        Response response = null;
        try{
            response = RestAssured.given().contentType(ContentType.JSON).get();
            ResponseBody= response.getBody().asString();
            System.out.println("API Response :"+ResponseBody);
            Gson gson = new Gson();
            CodeClass codeclass = gson.fromJson(ResponseBody,CodeClass.class);
            ObjectMapper obj = new ObjectMapper();
            String jsonStr = obj.writeValueAsString(codeclass);
            JSONObject jsonObject = new JSONObject(jsonStr);
            String codeval = jsonObject.get("code").toString();
            System.out.println("code :"+codeval);
//            String codeval1 = jsonObject.get("meta").toString();
            System.out.println("meta sdfdwe:");
            System.out.println("meta sdfdwe:");
            JSONObject meta = jsonObject.getJSONObject("meta");
            JSONObject pagination = meta.getJSONObject("pagination");
            String total = pagination.get("total").toString();
            System.out.println("total :"+total);

            Assert.assertEquals("200",codeval);
//            JSONObject code = jsonObject.getJSONObject("code");
//            JSONObject meta = code.getJSONObject("meta");
//            JSONObject pegi = meta.getJSONObject("pagination");
//            String meta = jsonObject.get("meta").toString();
//            System.out.println("meta :"+meta);
            JSONArray arr = jsonObject.getJSONArray("data");
            for(int i=0;i<7;i++){
                JSONObject dataObj = arr.getJSONObject(i);
                String id = dataObj.get("id").toString();
                System.out.println("id :"+id);
                String name = dataObj.get("name").toString();
                System.out.println("name :"+name);
                String email = dataObj.get("email").toString();
                System.out.println("email :"+email);
                String gender = dataObj.get("gender").toString();
                System.out.println("gender :"+gender);
                String status = dataObj.get("status").toString();
                System.out.println("status :"+status);
                String created_at = dataObj.get("created_at").toString();
                System.out.println("created_at :"+created_at);
                String updated_at = dataObj.get("updated_at").toString();
                System.out.println("updated_at :"+updated_at);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("API URL");

    }

    public void navigateUrl(){
        System.out.println("API URL 1");
    }

    public void verifyVal(){
        System.out.println("API URL 2");
    }
}
