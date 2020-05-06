import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import sensor.model.Sensor;

public class Sensorapp {

	public static void main(String[] args) {
		
	
		
		Sensor sensor=new Sensor(555,2,2,1,3);
		
		
			
		sensor.addSensor(sensor);
		sensor.updateSensor(sensor);
		
//		RestAssured.baseURI="http://localhost:8080";
//		Response response=null;
//		
//		try {
//			response=RestAssured.given().when().get("/findallSensors");
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//		JsonPath jsonPathEvaluator = response.jsonPath();
		
//		 System.out.println("response json:"+jsonPathEvaluator.get("id").toString());
		 
//		 List values = jsonPathEvaluator.getList("id");
//		 
//		 System.out.println("Size of object : "+ values.size());
//		 
//		 for (int i = 0; i < values.size(); i++) {
//			    System.out.println(values.get(i));
//			}
		 
//		System.out.println("response:"+response.asString());
//		System.out.println("status code:"+response.getStatusCode());
//		System.out.println("response contains co2?"+response.path("id"));
		
		
		
		

		
	}

}
