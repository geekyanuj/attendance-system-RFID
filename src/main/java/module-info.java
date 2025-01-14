module com.geekyanuj.projectrfid {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;
    requires java.base;

    opens com.geekyanuj.projectrfid to javafx.fxml;
    exports com.geekyanuj.projectrfid;
    exports com.geekyanuj.projectrfid.controller;
    opens com.geekyanuj.projectrfid.controller to javafx.fxml;
}