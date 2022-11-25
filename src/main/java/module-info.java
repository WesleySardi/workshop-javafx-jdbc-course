module com.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.workshopjavafxjdbc to javafx.fxml;
    opens com.example.workshopjavafxjdbc.model.entities;
    exports com.example.workshopjavafxjdbc;
}