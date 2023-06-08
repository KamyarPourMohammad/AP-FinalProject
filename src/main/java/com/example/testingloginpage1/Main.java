package com.example.testingloginpage1;//package com.example.testingloginpage1;

import com.example.testingloginpage1.Controller.LoginpageController;
import com.example.testingloginpage1.Moedel.Admin;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Admin admin= new Admin("Kamyar","1234");
    @Override
    public void start(Stage stage) throws IOException {
        LoginpageController loginpagecontroller=new LoginpageController();
        stage.setScene(new Scene(loginpagecontroller.getLoginpage()));
        stage.setWidth(700);
        stage.setHeight(500);
        stage.show();
        

    }

    public static void main(String[] args) {
        launch();
    }
}