import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class SimpleForm extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// * 1.Create & Configure user interface controls
		// Label
		Label helloLabel = new Label("Enter your name");
		// TextField
		TextField name = new TextField();
		// Button
		Button goButton = new Button();
		goButton.setText("Click Here !!");
		
		goButton.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		        // Logic for what should happen when you push button
		    	System.out.println("Output of actionEvent");

		    }
		});
		

		// * 2.Make a layout manager
		VBox root = new VBox(); // Decide the layout of GUI -STACKPANE, HBox, VBox, Grid etc
		
		// * 3.Add controls to the layout manager
		// in same order as above
		root.getChildren().add(helloLabel);
		
		root.getChildren().add(name);
		root.getChildren().add(goButton);
		
		// * 4.Add layout manager to scene
		// * 5.Add scene to a stage
		
		// set width and height to 300 & 250
		primaryStage.setScene(new Scene(root,300,250)); // Scene controls the height and width of the app
		
		//Setting the title bar
		primaryStage.setTitle("Example 01");
		
		// * 6.Show the app
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
