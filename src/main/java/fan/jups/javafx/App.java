package fan.jups.javafx;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setResources(ResourceBundle.getBundle("Labels", new Locale("de")));
		VBox root = (VBox) fxmlLoader.load(this.getClass().getResource("FxFXMLExample8.fxml").openStream());
		// replace the content
		// Create the Scene
		Scene scene = new Scene(root);
		// Set the Scene to the Stage
		stage.setScene(scene);
		// Set the Title to the Stage
		stage.setTitle("A FXML Example using Resource Bundles");
		// Display the Stage
		stage.show();
	}

	public static void main(String[] args) {

		launch();

	}

}