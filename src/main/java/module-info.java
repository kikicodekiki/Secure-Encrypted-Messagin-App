module org.example.secureencryptedmessaginapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.secureencryptedmessaginapp to javafx.fxml;
    exports org.example.secureencryptedmessaginapp;
}