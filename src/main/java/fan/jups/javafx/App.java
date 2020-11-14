package fan.jups.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) {

		// Create the Text Fields
		TextField firstNameFld = new TextField();
		TextField lastNameFld = new TextField();
		// Create the Labels
		Label firstNameLbl = new Label("_First Name:");
		Label lastNameLbl = new Label("_Last Name:");
		// Bind the Label to the according Field
		firstNameLbl.setLabelFor(firstNameFld);
		// Set mnemonic parsing to the Label
		firstNameLbl.setMnemonicParsing(true);
		// Bind the Label to the according Field
		lastNameLbl.setLabelFor(lastNameFld);
		// Set mnemonic parsing to the Label
		lastNameLbl.setMnemonicParsing(true);
		// Create the GridPane
		GridPane root = new GridPane();
		// Add the Labels and Fields to the GridPane
		root.addRow(0, firstNameLbl, firstNameFld);
		root.addRow(1, lastNameLbl, lastNameFld);
		// Set the Size of the GridPane
		root.setMinSize(350, 250);
		/*
		 * Set the padding of the GridPane Set the border-style of the GridPane Set the
		 * border-width of the GridPane Set the border-insets of the GridPane Set the
		 * border-radius of the GridPane Set the border-color of the GridPane
		 */

		root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
		// Create the Scene
		Scene scene = new Scene(root);
		// Add the scene to the Stage
		stage.setScene(scene);
		// Set the title of the Stage
		stage.setTitle("A Label Example");

		// Display the Stage
		stage.show();
	}

	public static void main(String[] args) {

		launch();

	}

}