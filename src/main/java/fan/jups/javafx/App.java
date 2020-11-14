package fan.jups.javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	// Create the Selection Label
	Label selectionMsg = new Label("Your selection: None");

	@Override
	public void start(Stage stage) {

		// Create four ToggleButtons
		ToggleButton fordBtn = new ToggleButton("Ford");
		ToggleButton audiBtn = new ToggleButton("Audi");
		ToggleButton ferrariBtn = new ToggleButton("Ferrari");
		ToggleButton porscheBtn = new ToggleButton("Porsche");
		// Create a ToggleGroup
		final ToggleGroup group = new ToggleGroup();
		// Add all ToggleButtons to a ToggleGroup
		group.getToggles().addAll(fordBtn, audiBtn, ferrariBtn, porscheBtn);
		// Create a ChangeListener for the ToggleGroup
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			public void changed(ObservableValue<? extends Toggle> ov, final Toggle toggle, final Toggle new_toggle) {
				String toggleBtn = ((ToggleButton) new_toggle).getText();
				selectionMsg.setText("Your selection: " + toggleBtn);
			}
		});
		// Create the Label for the Selection
		Label selectLbl = new Label("Select the car you like:");
		// Create a HBox
		HBox buttonBox = new HBox();
		// Add ToggleButtons to an HBox
		buttonBox.getChildren().addAll(fordBtn, audiBtn, ferrariBtn, porscheBtn);
		// Set the spacing between children to 10px
		buttonBox.setSpacing(10);
		// Create the VBox
		VBox root = new VBox();
		// Add the Labels and HBox to the VBox
		root.getChildren().addAll(selectionMsg, selectLbl, buttonBox);
		// Set the spacing between children to 10px
		root.setSpacing(10);
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
		stage.setTitle("A ToggleButton Example");
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