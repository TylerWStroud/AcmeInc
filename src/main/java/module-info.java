module com.acme.swe3313 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.acme.swe3313 to javafx.fxml;
    exports com.acme.swe3313;
}