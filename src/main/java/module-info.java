module com.tuvarna.bg.phonecatalog {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.tuvarna.bg.phonecatalog to javafx.fxml;
    exports com.tuvarna.bg.phonecatalog;
}