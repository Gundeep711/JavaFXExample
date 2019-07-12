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


public class FxExamle extends Application{

	
	public void start(Stage primaryStage) throws Exception
	{
		// Create UI Components
		Button button = new Button();
		button.setText("Click Here");
		//Put UI Components inside a container
		StackPane root = new StackPane();
		root.getChildren().add(button);
		// add the container to the scene
		primaryStage.setScene(new Scene(root,300,200));
		primaryStage.setTitle("My First FX Code");
		//show the scece
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}

}
