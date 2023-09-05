module com.example.basicdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.basicdemo to javafx.fxml;
    exports com.example.basicdemo;
}