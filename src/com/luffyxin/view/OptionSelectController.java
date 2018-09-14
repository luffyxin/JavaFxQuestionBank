package com.luffyxin.view;

import javafx.fxml.FXML;

import javafx.scene.control.RadioButton;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class OptionSelectController {

    @FXML
    private AnchorPane  ap;

    public OptionSelectController(){
        Context.controllers.put(this.getClass().getSimpleName(),this);
    }

    @FXML
    public void initialize(){
      List<RadioButton> radios= Arrays.asList(
                new RadioButton("常量变量"),
                new RadioButton("流程控制语句"),
                new RadioButton("数组"),
                new RadioButton("方法"),
                new RadioButton("基础强化"),
                new RadioButton("类、封装、this、构造方法"),
                new RadioButton("Scanner类、String类、StringBuilder类"),
                new RadioButton("ArrayList集合"),
                new RadioButton("字符流、字符缓冲流")
        );
      for(int i=0;i<radios.size();i++){
          ap.getChildren().add(radios.get(i));
          AnchorPane.setTopAnchor(radios.get(i),i*20.0);
      }



    }

}
