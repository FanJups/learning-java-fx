module fan.jups.javafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;

	opens fan.jups.javafx to javafx.fxml;

	exports fan.jups.javafx;
}