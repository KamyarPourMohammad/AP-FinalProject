package com.example.testingloginpage1.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainPage extends BorderPane {
    private Button addBTN;
    private Button removeBTN;
    private Button ExitBTN;

    public MainPage() {
        createNewElements();
        VBox vbox= new VBox(addBTN,removeBTN,ExitBTN);
        vbox.setSpacing(15);
        vbox.setAlignment(Pos.CENTER);
        this.setRight(vbox);


    }
    public void createNewElements(){
        addBTN=new Button("Add music");
        removeBTN=new Button("Remove music");
        ExitBTN=new Button("Exit");

    }




    public Button getAddBTN() {
        return addBTN;
    }

    public void setAddBTN(Button addBTN) {
        this.addBTN = addBTN;
    }

    public Button getRemoveBTN() {
        return removeBTN;
    }

    public void setRemoveBTN(Button removeBTN) {
        this.removeBTN = removeBTN;
    }

    public Button getExitBTN() {
        return ExitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        ExitBTN = exitBTN;
    }
}
