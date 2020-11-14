package fan.jups.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	// Create the Message Label
	Label messageLbl = new Label("Press any Button to see the message");

	@Override
	public void start(Stage stage) {

		// Create a normal button with N as its mnemonic
		Button newBtn = new Button("_New");
		// Add EventHandler to the Button
		newBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have pressed the new Button");
			}
		});
		// Create a default button with S as its mnemonic
		Button saveBtn = new Button("_Save");
		// Set this Button as the Default
		saveBtn.setDefaultButton(true);
		// Add EventHandler to the Button
		saveBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have pressed the save Button");
			}
		});
		// Create a cancel button with C as its mnemonic
		Button cancelBtn = new Button("_Cancel");
		cancelBtn.setCancelButton(true);
		// Add EventHandler to the Button
		cancelBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have pressed the cancel Button");
			}
		});
		// Create the HBox
		HBox buttonBox = new HBox();
		// Add the children to the HBox
		buttonBox.getChildren().addAll(newBtn, saveBtn, cancelBtn);
		// Set the vertical spacing between children to 15px
		buttonBox.setSpacing(15);
		// Create the VBox
		VBox root = new VBox();
		// Add the children to the VBox
		root.getChildren().addAll(messageLbl, buttonBox);
		// Set the vertical spacing between children to 15px
		root.setSpacing(15);
		// Set the Size of the VBox
		root.setMinSize(350, 250);
		/*
		 * Set the padding of the VBox Set the border-style of the VBox Set the
		 * border-width of the VBox * Set the border-insets of the VBox Set the
		 * border-radius of the VBox Set the border-color of the VBox
		 */
		root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
// Create the Scene
		Scene scene = new Scene(root);
// Add the scene to the Stage
		stage.setScene(scene);
// Set the title of the Stage
		stage.setTitle("A Button Example");
// Display the Stage
		stage.show();

	}

	// Helper Method
	public void printMessage(String message) {
		// Set the Text of the Label
		messageLbl.setText(message);
	}

	public static void main(String[] args) {

		launch();

	}

}