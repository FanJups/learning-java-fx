package fan.jups.javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	// Create the Selection Label
	Label selectionLbl = new Label("Your selection: None");

	@Override
	public void start(Stage stage) {

		// Create the Label for the Car
		Label carLbl = new Label("Car:");
		// Create a ComboBox for cars
		ComboBox<String> cars = new ComboBox<>();
		// Add the items to the ComboBox
		cars.getItems().addAll("Ford", "Audi", "Ferrari", "Porsche");
		// Select the first car from the list
		cars.getSelectionModel().selectFirst();
		// Add a ChangeListener to the ComboBox
		cars.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
				selectionLbl.setText("Your selection: " + newValue);
			}
		});
		// Create the HBox
		HBox carbox = new HBox();
		// Add the children to the HBox
		carbox.getChildren().addAll(carLbl, cars);
		// Set the vertical spacing between children to 10px
		carbox.setSpacing(10);
		// Create the VBox
		VBox root = new VBox();
		// Add the children to the VBox
		root.getChildren().addAll(carbox, selectionLbl);
		// Set the vertical spacing between children to 10px
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
		stage.setTitle("A ComboBox Example");
		// Display the Stage
		stage.show();
	}

	public static void main(String[] args) {

		launch();

	}

}