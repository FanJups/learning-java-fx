package fan.jups.javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
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
		// Create the RadioButtons
		RadioButton fordBtn = new RadioButton("Ford");
		RadioButton audiBtn = new RadioButton("Audi");
		RadioButton ferrariBtn = new RadioButton("Ferrari");
		RadioButton porscheBtn = new RadioButton("Porsche");
		// Create a ToggleGroup
		ToggleGroup group = new ToggleGroup();
		// Add all RadioButtons to a ToggleGroup
		group.getToggles().addAll(fordBtn, audiBtn, ferrariBtn, porscheBtn);
		// Add a listener to the ToggleGroup
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			public void changed(ObservableValue<? extends Toggle> ov, final Toggle toggle, final Toggle new_toggle) {
				String toggleBtn = ((ToggleButton) new_toggle).getText();
				selectionMsg.setText("Your selection: " + toggleBtn);
			}
		});
		// Select the default car as ferrari
		ferrariBtn.setSelected(true);
		// Create the Selection Label
		Label msg = new Label("Select the car you like the most:");
		// Create a HBox
		HBox buttonBox = new HBox();
		// Add RadioButtons to an HBox
		buttonBox.getChildren().addAll(fordBtn, audiBtn, ferrariBtn, porscheBtn);
		// Set the spacing between children to 10px
		buttonBox.setSpacing(10);
		// Create the VBox
		VBox root = new VBox();
		// Add Labels and RadioButtons to an VBox
		root.getChildren().addAll(selectionMsg, msg, buttonBox);
		// Set the spacing between children to 10px
		root.setSpacing(10);
		// Set the Size of the VBox
		root.setMinSize(350, 250);
		/*
		 * Set the padding of the VBox Set the border-style of the VBox Set the
		 * border-width of the VBox Set the border-insets of the VBox Set the
		 * border-radius of the VBox * Set the border-color of the VBox
		 */
		root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
// Create the Scene
		Scene scene = new Scene(root);
// Add the scene to the Stage
		stage.setScene(scene);
// Set the title of the Stage
		stage.setTitle("A RadioButton Example");
// Display the Stage
		stage.show();
	}

	public static void main(String[] args) {

		launch();

	}

}