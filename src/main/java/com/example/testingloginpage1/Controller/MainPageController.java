package com.example.testingloginpage1.Controller;

import com.example.testingloginpage1.View.MainPage;

public class MainPageController {
    private MainPage mainpage;

    public MainPageController(){
        setMainpage(new MainPage());

    }

    public MainPage getMainpage() {
        return mainpage;
    }

    public void setMainpage(MainPage mainpage) {
        this.mainpage = mainpage;
    }
}
