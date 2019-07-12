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
	public void start(Stage primarStage) throws Exception {
		// * 1.Create & Configure user interface controls
		// Label
		Label helloLabel = new Label("Enter your name");
		// TextField
		TextField name = new TextField();
		// Button
		Button goButton = new Button();
		goButton.setText("Click Here !!");

		// * 2.Make a layout manager
		VBox root = new VBox();
		// * 3.Add controls to the layout manager
		// * 4.Add layout manager to scene
		// * 5.Add scene to a stage
		// * 6.Show the app

	}

	public static void main(String[] args) {

	}

}
