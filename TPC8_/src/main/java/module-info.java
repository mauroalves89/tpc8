module com.example.tpc8_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tpc8_ to javafx.fxml;
    exports com.example.tpc8_;
}