import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		
		//Create an instance of FXMainPane
		
		launch(args);
		
		
	}
	
	
		   
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		//  set the scene to hold root
		//set stage title
		
		//Task#1 - item 3
		FXMainPane root = new FXMainPane();
		
		Scene scene = new Scene (root,400,200);
		stage.setScene(scene);
				
		stage.setTitle("Hello World GUI");
		//display the stage
		stage.show();
		

	}
}