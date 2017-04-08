package application;

import javafx.fxml.FXML; 
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Label;



public class MainWindowController {

	
	
	@FXML TableView<Person> tableView;
	@FXML TableColumn<Person,String> firstNameColumn;
	@FXML TableColumn<Person,String> lastNameColumn;
	@FXML Label firstNameLabel, lastNameLabel, phoneLabel, cityLabel, postcodeLabel;
	
	  
	
	
	private Main main;

	
	
	//Initialise tableview and columns 
	public void initialize() {
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("firstName"));
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("lastName"));
		
		tableView.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> showDetails(newValue));
		
	}  
	
	 
	
	
	public void setMain(Main main){
		this.main = main;
		tableView.setItems(main.getPersonData());  //Responsible for data that is selected from the table
		
		  
		
	} 
	
	public void refreshTableView(){
		tableView.setItems(null);
		tableView.layout();
		tableView.setItems(main.getPersonData());
		
		
		
		
	}
	
	public void showDetails(Person person){
		firstNameLabel.setText(person.getFirstName());
		lastNameLabel.setText(person.getLastName());
		phoneLabel.setText(person.getPhoneNumber());
		cityLabel.setText(person.getCity());
		postcodeLabel.setText(person.getPostCode()); 
		
			
	}
	

	/*
	 * button method - handles the actions
	 * New - create
	 * Edit - update
	 * Delete - delete
	 */
	
	@FXML  
	public void handleNew(){
		main.newPersonWindow(null);
		
		
		
	}
	@FXML
	public void handleEdit(){
		Person person = tableView.getSelectionModel().getSelectedItem();
		Boolean okClicked = main.newPersonWindow(person);
		boolean okayClicked = false;
		if(okayClicked){
			refreshTableView();
			
					
		}
		
		
	}
	@FXML
	public void handleDelete(){
		int index = tableView.getSelectionModel().getSelectedIndex();
		main.getPersonData().remove(index); //remove and updates data from the table view
		
		
	} 
	
	
	
	
		
	}


