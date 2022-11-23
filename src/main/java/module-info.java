module idk.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens idk.demo to javafx.fxml;
    exports idk.demo;
}