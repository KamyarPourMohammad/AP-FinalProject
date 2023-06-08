package com.example.testingloginpage1.View;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class LoginPage extends VBox {
    private TextField usernameField;
    private TextField passwordField;
    private Label errorLBL;
    private Button loginBTN;
    public LoginPage() {
        Label usernameLBL = new Label("username");
        setUsernameField(new TextField());
        HBox usernameRow = new HBox(usernameLBL, usernameField);
        usernameRow.setAlignment(Pos.CENTER);

        Label passwordLBL= new Label("password");
        passwordField=new TextField();
        HBox passwordRow= new HBox(passwordLBL, passwordField );
        passwordRow.setAlignment(Pos.CENTER);

        errorLBL=new Label();

        loginBTN=new Button("Login");

        this.getChildren().addAll(usernameRow,passwordRow,errorLBL,loginBTN);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);

    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(TextField passwordField) {
        this.passwordField = passwordField;
    }

    public Label getErrorLBL() {
        return errorLBL;
    }

    public void setErrorLBL(Label errorLBL) {
        this.errorLBL = errorLBL;
    }

    public Button getLoginBTN() {
        return loginBTN;
    }

    public void setLoginBTN(Button loginBTN) {
        this.loginBTN = loginBTN;
    }
}
