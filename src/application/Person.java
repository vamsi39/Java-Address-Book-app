package application;

// PERSON model

public class Person {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String city;
	private String postCode;
	
	// Attributes of person model  - arguments required to create new person
	public Person(String firstName,String lastName, String phoneNumber, String city, String postCode){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.city = city; 
		this.postCode = postCode ; 
		
			
	}  
	
	/*
	
	public Person(String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
		
		*/
	
		
	

	// getter methods - return string to get attribute of person
	public String  getFirstName() {return firstName; }
	public String  getLastName() {return lastName; }
	public String  getPhoneNumber() {return phoneNumber; }
	public String  getCity() {return city; }
	public String  getPostCode() {return postCode; }
	
	
	// setter methods - the way to change of attributes of person model
	public void setFirstname(String firstName) { this.firstName = firstName; }
	public void setLastname(String lastName) { this.lastName = lastName; }
	public void setPhonenumber(String phoneNumber) { this.phoneNumber = phoneNumber; }	
	public void setCity(String city) { this.city = city; }	
	public void setPostcode(String postCode) { this.postCode = postCode; }

	
	
	public void setPhoneNumber(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setPostCode(String text) {
		// TODO Auto-generated method stub
		
	}	
		
	}
	
	
		
		 
	
	
	
	
	
	
	
	
	
	

