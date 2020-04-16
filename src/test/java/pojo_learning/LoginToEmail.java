package pojo_learning;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import dummyJSON.Employee;

public class LoginToEmail {
	ReadingJSON_Pojo objPojo = new ReadingJSON_Pojo();
	String uName;
	String pWord;

	// @Test
	public void readData() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader(
				"C://Users//manju//Desktop//Selenium//Sel_Maven1//src//test//java//pojo_learning//pojo.json"));
		JSONObject jo = (JSONObject) obj;

		uName = (String) jo.get("userName");
		pWord = (String) jo.get("passWord");

		System.out.println(uName);
		System.out.println(pWord);
		// using pojo class
		System.out.println(objPojo.getPassWord());

		ObjectMapper objectMapper = new ObjectMapper();

	}

	@Test
	public void readDataTest() throws IOException {
		// read json file data to String
		byte[] jsonData = Files.readAllBytes(Paths
				.get("C://Users//manju//Desktop//Selenium//Sel_Maven1//src//test//java//pojo_learning//pojo.json"));

		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		// convert json string to object
		ReadingJSON_Pojo dummy = objectMapper.readValue(jsonData, ReadingJSON_Pojo.class);

		System.out.println("Hello: " + dummy.getUserName());
	}

}
