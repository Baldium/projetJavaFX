module appli.todolistfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires spring.security.crypto;

    opens appli.todolistfx to javafx.fxml;
    exports appli.todolistfx;
    exports appli.todolistfx.accueil;
    opens appli.todolistfx.accueil to javafx.fxml;
}