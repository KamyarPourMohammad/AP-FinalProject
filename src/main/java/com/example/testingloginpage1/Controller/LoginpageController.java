package com.example.testingloginpage1.Controller;

import com.example.testingloginpage1.Main;
import com.example.testingloginpage1.View.LoginPage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginpageController {
    private LoginPage loginpage;

    public LoginpageController(){
        loginpage=new LoginPage();
        initF();
    }
    public void initF(){
        loginpage.getLoginBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(Main.admin.getUsername().equals(loginpage.getUsernameField().getText()) && Main.admin.getPassword().equals(loginpage.getPasswordField().getText())){
                    loginpage.getScene().getWindow().hide();
                    MainPageController mainpagecontrollerpage=new MainPageController();

                    Stage mainPageStage=new Stage();
                    mainPageStage.setScene(new Scene(mainpagecontrollerpage.getMainpage()));
                    mainPageStage.show();
//                    loginpage.getErrorLBL().setTextFill(Color.GREEN);
//                    loginpage.getErrorLBL().setText("valid");
                }
                else {
                    loginpage.getErrorLBL().setTextFill(Color.RED);
                    loginpage.getErrorLBL().setText("unvalid");
                }
            }
        });
    }

    public LoginPage getLoginpage() {
        return loginpage;
    }

    public void setLoginpage(LoginPage loginpage) {
        this.loginpage = loginpage;
    }
}
