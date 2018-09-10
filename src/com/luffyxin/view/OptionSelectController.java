package com.luffyxin.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionSelectController {

    @FXML
    private GridPane gridpane;

    @FXML
    public void initialize(){
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        List<Label> classify= Arrays.asList(
                new Label("分类A"),
                new Label("分类B"),
                new Label("分类C"),
                new Label("分类D"),
                new Label("分类E"),
                new Label("分类F"),
                new Label("分类A"),
                new Label("分类B"),
                new Label("分类C"),
                new Label("分类D"),
                new Label("分类E"),
                new Label("分类F"),
                new Label("分类A"),
                new Label("分类B"),
                new Label("分类C"),
                new Label("分类D"),
                new Label("分类E"),
                new Label("分类F")
        );
        List<TextField> nums=Arrays.asList(
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField(),
                new TextField()
        );
        for (int i=0;i<nums.size();i++){
            gridpane.add(classify.get(i),0,i);
            gridpane.add(nums.get(i),1,i);
        }






    }

}
