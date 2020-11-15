module fan.jups.javafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;

	opens fan.jups.javafx to javafx.fxml;
	opens fan.jups.javafx.controller to javafx.fxml;

	exports fan.jups.javafx;
}