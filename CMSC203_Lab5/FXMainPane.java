


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
//instantiate the buttons, label, and textfield
		
	Label promptLabel; 
	TextField myTextField; 
	Button button1,button2,button3,button4,button5; 
		
//  instantiate the HBoxes
		HBox hBox1 ;
		HBox hBox2 ;
		
	//  declare two HBoxes
	
	//student Task #4:
	//  declare an instance of DataManager
		DataManager myDataManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		
		 button1 = new Button("Hello");
		 button2 = new Button("Howdy");
		 button3 = new Button("Chinese");
		 button4 = new Button("Clear");
		 button5 = new Button("Exit");
		 promptLabel = new Label("Feedback");
		 myTextField = new TextField();
		 
		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
		
		 
		 hBox1 = new HBox();
		 hBox2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		 myDataManager = new DataManager();
		//  set margins and set alignment of the components
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hBox1.getChildren().addAll(button1, button2, button3, button4, button5);
		hBox2.getChildren().addAll(promptLabel, myTextField);

		
		//  add the buttons to the other HBox
		
		
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox1,hBox2);
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	//Task#4, number 1, Declare an instance of DataManagr
	
	
	//Task#4, number 2, a
	private class ButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent event)
		{
		if (event.getTarget() == button1)
			
		{
			myTextField.setText(myDataManager.getHello());
		}
			
		if (event.getTarget() == button2)
			
		{
			myTextField.setText(myDataManager.getHowdy());
		}	
			
		if (event.getTarget() == button3)
			
		{
			myTextField.setText(myDataManager.getChinese());
		}
        if (event.getTarget() == button4)
			
		{
			myTextField.setText("");
		}
        if (event.getTarget() == button5)
			
		{
			System.exit(0);
		}
		
		}
		
		
		
		
	}
	
	
}















	