package com.luffyxin.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class RootLayoutController {

    public RootLayoutController(){
        Context.controllers.put(this.getClass().getSimpleName(), this);
    }

}
