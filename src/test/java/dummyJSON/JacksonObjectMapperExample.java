package dummyJSON;


import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;



public class JacksonObjectMapperExample {

	public static void main(String[] args) throws IOException {
		
		//read json file data to String
		byte[] jsonData = Files.readAllBytes(Paths.get("C://Users//manju//Desktop//Selenium//Sel_Maven1//src//test//java//dummyJSON//pojo.json"));
		
		//C:\Users\manju\Desktop\Selenium\Sel_Maven1\src\test\java\dummyJSON\pojo.json
		
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		
		//convert json string to object
		Employee emp = objectMapper.readValue(jsonData, Employee.class);
		
		//System.out.println("Employee Object\n"+emp);
		
		System.out.println("hello: "+emp.getId());
		System.out.println("address: "+emp.getAddress().getCity());
		System.out.println("ph num: "+emp.getPhoneNumbers().length);
		System.out.println("cities: "+emp.getCities().size());
		System.out.println("Address2: "+emp.getAddress2().city);
		
		for(int i = 0; i<emp.getPhoneNumbers().length;i++){
			System.out.println("ph num is: "+emp.getPhoneNumbers()[i]);
		}
		for(String s:emp.getCities()  ){
			System.out.println("cities: "+s);
		}
		/*
		//convert Object to json string
		Employee emp1 = createEmployee();
		//configure Object mapper for pretty print
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		//writing to console, can write to any output stream such as file
		StringWriter stringEmp = new StringWriter();
		objectMapper.writeValue(stringEmp, emp1);
		System.out.println("Employee JSON is\n"+stringEmp);
	*/
		}
	
	/*
	 public static Employee createEmployee() {

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("David");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Manager");

		Address add = new Address();
		add.setCity("Bangalore");
		add.setStreet("BTM 1st Stage");
		add.setZipcode(560100);
		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp.setProperties(props);

		return emp;
	}
	*/

}
