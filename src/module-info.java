module Prueba {
	requires javafx.controls;
	requires jdk.incubator.vector;
	requires junit;

	opens application to javafx.graphics, javafx.fxml;
}
