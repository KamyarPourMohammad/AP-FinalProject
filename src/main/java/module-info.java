module com.example.testingloginpage1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testingloginpage1 to javafx.fxml;
    exports com.example.testingloginpage1;
}