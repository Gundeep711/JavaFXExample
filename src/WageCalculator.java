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

public class WageCalculator extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label EnterName = new Label("Enter your Name");
		TextField nameBox = new TextField();
		Label EnterHours = new Label("Enter number of Hours");
		TextField hours = new TextField();
		Label rate = new Label("Enter hourly rate");
		TextField hourlyrate = new TextField();
		Button calculate = new Button();
		calculate.setText("Calculate");
		Label result = new Label();

		calculate.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				// Logic for what should happen when you push button
				// 1. Get what typed in the text boxes
				String name = nameBox.getText();
				String hoursWorked = hours.getText();
				Double hoursW = Double.parseDouble(hoursWorked);
				String hourlyWage = hourlyrate.getText();
				Double hoursR = Double.parseDouble(hourlyWage);
				Double total = hoursW * hoursR;

				//System.out.println("Name " + name + " hoursWorked" + hoursWorked + " WageRate " + hourlyWage+" total Earnings"+total);

				// 2. Do some calculations

				// 3.Output the result to the screeen
				result.setText(name +" earns "+total);

			}
		});

		VBox root = new VBox();
		root.getChildren().add(EnterName);
		root.getChildren().add(nameBox);
		root.setSpacing(20);
		root.getChildren().add(EnterHours);
		root.getChildren().add(hours);
		root.getChildren().add(rate);
		root.getChildren().add(hourlyrate);
		root.getChildren().add(calculate);
		root.getChildren().add(result);

		primaryStage.setScene(new Scene(root, 400, 550));
		primaryStage.setTitle("WageCalculator");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
