package fan.jups.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	// Create the Message Label
	Label messageLbl = new Label("Choose your car!");

	@Override
	public void start(Stage stage) {

		// Create the MenuItem ford
		MenuItem ford = new MenuItem("Ford");
		// Add EventHandler to the MenuItem
		ford.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have selected: Ford");
			}
		});
		// Create the MenuItem audi
		MenuItem audi = new MenuItem("Audi");
		// Add EventHandler to the MenuItem
		audi.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have selected: Audi");
			}
		});
		// Create the MenuItem ferrari
		MenuItem ferrari = new MenuItem("Ferrari");
		// Add EventHandler to the MenuItem
		ferrari.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have selected: Ferrari");
			}
		});
		// Create the MenuItem porsche
		MenuItem porsche = new MenuItem("Porsche");
		// Add EventHandler to the MenuItem
		porsche.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have selected: Porsche");
			}
		});
		// Create the MenuButton
		MenuButton cars = new MenuButton("Select");
		// Add menu items to the MenuButton
		cars.getItems().addAll(ford, audi, ferrari, porsche);
		// Create the VBox
		VBox root = new VBox();
		// Add the children to the VBox
		root.getChildren().addAll(cars, messageLbl);
		// Set the Size of the VBox
		root.setMinSize(350, 250);
		/*
		 * * Set the padding of the VBox Set the border-style of the VBox Set the
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
		stage.setTitle("A MenuButton Example");
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