package dummyJSON;

import java.util.ArrayList;

public class JSON_Pojo {
	
	private float id;
	 private String name;
	 private boolean permanent;
	 Address AddressObject;
	 ArrayList < Object > phoneNumbers = new ArrayList < Object > ();
	 private String role;
	 ArrayList < Object > cities = new ArrayList < Object > ();
	 Properties PropertiesObject;


	 // Getter Methods 

	 public float getId() {
	  return id;
	 }

	 public String getName() {
	  return name;
	 }

	 public boolean getPermanent() {
	  return permanent;
	 }

	 public Address getAddress() {
	  return AddressObject;
	 }

	 public String getRole() {
	  return role;
	 }

	 public Properties getProperties() {
	  return PropertiesObject;
	 }

	 // Setter Methods 

	 public void setId(float id) {
	  this.id = id;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setPermanent(boolean permanent) {
	  this.permanent = permanent;
	 }

	 public void setAddress(Address addressObject) {
	  this.AddressObject = addressObject;
	 }

	 public void setRole(String role) {
	  this.role = role;
	 }

	 public void setProperties(Properties propertiesObject) {
	  this.PropertiesObject = propertiesObject;
	 }
	}

