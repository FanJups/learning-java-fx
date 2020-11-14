package fan.jups.javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	// Create the Selection Label
	Label selectionMsg = new Label("Choose your Car");

	@Override
	public void start(Stage stage) {

		// Create a CheckBox to support only two states
		CheckBox fordCbx = new CheckBox("Ford");
		// Create a CheckBox to support three states
		CheckBox audiCbx = new CheckBox("Audi");
		audiCbx.setAllowIndeterminate(true);
		// Add a ChangeListener to the CheckBox fordCbx
		fordCbx.selectedProperty().addListener(new ChangeListener<Boolean>() {
			public void changed(ObservableValue<? extends Boolean> ov, final Boolean value, final Boolean newValue) {
				if (newValue != null && newValue) {
					printMessage("Your Selection: Ford");
				}
			}
		});
		// Add a ChangeListener to the CheckBox audiCbx
		audiCbx.selectedProperty().addListener(new ChangeListener<Boolean>() {
			public void changed(ObservableValue<? extends Boolean> ov, final Boolean value, final Boolean newValue) {
				if (newValue != null && newValue) {
					printMessage("Your Selection: Audi");
				}
			}
		});
		// Add a ChangeListener to the CheckBox audiCbx
		audiCbx.indeterminateProperty().addListener(new ChangeListener<Boolean>() {
			public void changed(ObservableValue<? extends Boolean> ov, final Boolean value, final Boolean newValue) {
				if (newValue != null && newValue) {
					printMessage("Your indeterminate Selection: Audi");
				}
			}
		});
		// Create the VBox
		VBox root = new VBox();
		// Add the children to the VBox
		root.getChildren().addAll(selectionMsg, fordCbx, audiCbx);
		// Set the vertical spacing between children to 20px
		root.setSpacing(20);
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
		stage.setTitle("A CheckBox Example");
		// Display the Stage
		stage.show();
	}

	// Helper Method
	public void printMessage(String message) {
		// Set the Text of the Label
		selectionMsg.setText(message);
	}

	public static void main(String[] args) {

		launch();

	}

}