package fan.jups.javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	// Create the Selection Label
	Label selectionLbl = new Label("Your selection: None");

	@Override
	public void start(Stage stage) {

		// Create the ListView
		ListView<String> cars = new ListView<String>();
		// Add Items to the ListView
		cars.getItems().addAll("Ford", "Audi", "Ferrari", "Porsche");
		// Select the first car from the list
		cars.getSelectionModel().selectFirst();
		// Add ChangeListener to the ListView
		cars.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
				selectionLbl.setText("Your selection: " + newValue);
			}
		});
		// Create the GridPane
		GridPane root = new GridPane();
		// Set the horizontal and vertical spacing between columns and rows
		root.setVgap(10);
		root.setHgap(10);
		// Add ListView and Label to the GridPane
		root.addRow(0, cars);
		root.addRow(1, selectionLbl);
		// Set the Size of the GridPane
		root.setMinSize(300, 200);
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
		stage.setTitle("A ListView Example");
		// Display the Stage
		stage.show();
	}

	public static void main(String[] args) {

		launch();

	}

}