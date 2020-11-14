package fan.jups.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	// Create the Message Label
	Label messageLbl = new Label("Press any Menu Item to see the message");

	@Override
	public void start(Stage stage) {
		// Create some menus
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");
		// Create the MenuItem New
		MenuItem newItem = new MenuItem("New");
		newItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have pressed the New Menu Item");
			}
		});
		// Create the MenuItem Open
		MenuItem openItem = new MenuItem("Open");
		openItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have pressed the Open Menu Item");
			}
		});
		// Add menu items to the File menu
		fileMenu.getItems().addAll(newItem, openItem);
		// Create the MenuItem Copy
		MenuItem copyItem = new MenuItem("Copy");
		copyItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have pressed the Copy Menu Item");
			}
		});
		// Create the MenuItem Paste
		MenuItem pasteItem = new MenuItem("Paste");
		pasteItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				printMessage("You have pressed the Paste Menu Item");
			}
		});
		// Add menu items to the Edit menu
		editMenu.getItems().addAll(copyItem, pasteItem);
		// Create a menu bar
		MenuBar menuBar = new MenuBar();
		// Add menus to a menu bar
		menuBar.getMenus().addAll(fileMenu, editMenu);
		// Create the Menu Box
		HBox menu = new HBox();
		// Add the MenuBar to the Menu Box
		menu.getChildren().add(menuBar);
		// Create the VBox
		VBox root = new VBox();
		// Add the children to the VBox
		root.getChildren().addAll(menu, messageLbl);
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
		stage.setTitle("A Menu Example");
		// Display the Stage
		stage.show();
	}

	// Helper Method
	public void printMessage(String message) {// Set the Text of the Label
		messageLbl.setText(message);
	}

	public static void main(String[] args) {

		launch();

	}

}