package application;
	
import java.io.IOException;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private Stage primaryStage; // Instantiate the element stage that we give as an argument in start method 
	
	@Override 
	// Start method - takes in argument Stage called primaryStage
	// Stage - ground level of application
	// 1st window launched - primaryStage
	// Can place elements - buttons , labels text fields 
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		mainWindow();
		
	}  
		 
		
		
		// Display all elements in first window
		//Connect to all the parts that are part of the  first window
		// Will add structure to code and flexibility 
		public void mainWindow(){
			try {
				FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml")); // Links to View
				AnchorPane pane = loader.load();
				Scene scene = new Scene(pane); // Scene - content that is displayed on primaryStage
				// pane loads elements such as buttons , labels , text fields etc.
				
				MainWindowController controller = loader.getController();
				controller.setMain(this); 
				
				//Constraints to primaryStage
				primaryStage.setScene(scene);
				primaryStage.setResizable(false);
				primaryStage.show();
				
			} catch (IOException e) { 
					// TODO Auto-generated catch block
					e.printStackTrace();
							
				
			}	
			
			
		}
		
		
		//Person Window
		public boolean newPersonWindow(Person person){
			try {
				FXMLLoader loader = new FXMLLoader(Main.class.getResource("NewPersonView.fxml")); // Links to View
				AnchorPane pane = loader.load();
				Scene scene = new Scene(pane); // Scene - content that is displayed on primaryStage
				// pane loads elements such as buttons , labels , text fields etc.
				
				
				Stage stage = new Stage();  
			    NewPersonController controller = loader.getController();
				controller.setMain(this, stage, person); 
				
				//Constraints to primaryStage
				stage.setScene(scene);
				stage.setResizable(false);
				stage.showAndWait(); //stage will be shown , but waits for reaction from user
				return controller.isOkayClicked();
				
			} catch (IOException e) { 
					// TODO Auto-generated catch block
					e.printStackTrace();
							
				
			}
			return false;	
			
			
		}
		
		private ObservableList<Person> personData = FXCollections.observableArrayList();
		public ObservableList<Person> getPersonData(){ return personData; }
		
		public Main(){
			
			//Adds new person objects - a new instance of person model that was created & adds it to person data
			//Makes use of constructor made for person model
			personData.add(new Person("Satya", "Nadella", "7847623203", "Redmond", "98052"));
			personData.add(new Person("Tim", "Cook", "988904630", "Cupertino", "95014"));
			personData.add(new Person("Sundar", "Pichai", "480468043", "Mountain View", "94043"));
			personData.add(new Person("Jeff", "Bezos", "9794392230", "Seattle", "98109"));
			personData.add(new Person("Elon" , "Musk" , "874278949" , "Palo Alto" , "94020"));
			
			
		}
		
		  

	
	public static void main(String[] args) {
		launch(args);
	}
}
