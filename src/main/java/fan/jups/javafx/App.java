package fan.jups.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	// Create the Message TextArea
	TextArea messageArea = new TextArea();

	@Override
	public void start(Stage stage) {

		// Create the TextField for the Input
		final TextField input = new TextField();
		input.setPromptText("Input your message here");
		// Set the Prompt and Size of the TextArea
		messageArea.setPromptText("Your Message:");
		messageArea.setPrefColumnCount(20);
		messageArea.setPrefRowCount(10);
		// Create the Print Button
		Button printBtn = new Button("Print Message");
		// Add an EvenetHandler to the Button
		printBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				messageArea.appendText(input.getText() + "\n");
			}
		});
		// Create the VBox
		VBox root = new VBox();
		// Add Labels, TextArea and TextField to the VBox
		root.getChildren().addAll(new Label("Input:"), input, new Label("Messages:"), messageArea, printBtn);
		// Set the Size of the VBox
		root.setMinSize(350, 250);
		/*
		 * Set the padding of the VBox Set the border-style of the VBox Set the
		 * border-width of the VBox Set the border-insets of the VBox Set the
		 * border-radius of the VBox Set the border-color of the VBox
		 */
		root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
		// Create the Scene
		Scene scene = new Scene(root);
		// Add the scene to the Stage
		stage.setScene(scene);
		// Set the title of the Stage
		stage.setTitle("A TextArea Example");
		// Display the Stage
		stage.show();
	}

	public static void main(String[] args) {

		launch();

	}

}