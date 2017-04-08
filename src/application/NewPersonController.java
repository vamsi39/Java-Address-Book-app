package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class NewPersonController {
	
	
	/*
	@FXML private TextField firstNameField, lastNameField, phoneNumberField, cityField, postcodeField;
	*/
	@FXML TextField FirstNameField, LastNameField, PhoneNumberField, CityField, PostCodeField;
	@FXML Button CancelButton, OkayButton;	   
	
	private Stage stage;
	private Person person;
	private Main main;
	
	
	private Boolean okayClicked = false;


	
	public void setMain(Main main, Stage stage, Person person){
		this.main = main;
		this.stage = stage;
		this.person = person;
		if(person != null) {
			fillPersonDetails();
				
			
		}
		
				
	}
	public boolean isOkayClicked() {
		return okayClicked;
		
		
		
	}
	
	
	
	// Fill person details for edit contact
	public void fillPersonDetails(){
		FirstNameField.setText(person.getFirstName());
		LastNameField.setText(person.getLastName());
		PhoneNumberField.setText(person.getPhoneNumber());
		CityField.setText(person.getCity());
		PostCodeField.setText(person.getPostCode());
	
	
	
		
		
		
	}
	@FXML  //button methods
	public void handleOkay(){
		if(person != null){
			person.setFirstname(FirstNameField.getText());
			person.setLastname(LastNameField.getText());
			person.setPhoneNumber(PhoneNumberField.getText());
			person.setCity(CityField.getText());
			person.setPostCode(PostCodeField.getText());
			okayClicked = true;
		} 
		else {  
			
			Person newPerson = new Person(
					FirstNameField.getText(),
					LastNameField.getText(),
					PhoneNumberField.getText(),
					CityField.getText(),
					PostCodeField.getText()
					);
			
			main.getPersonData().add(newPerson); // person will be added to tableview automatically as it is created
			
		}
		
		stage.close();     
		 
	 		
		
	}
	@FXML
	public void handleCancel(){
		stage.close(); //when clicking the 'close' button the stage/window should close
		
	      	   
		
	}
	
	
	
}
		
		
	 


