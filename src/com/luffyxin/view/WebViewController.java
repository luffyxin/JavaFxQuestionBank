package com.luffyxin.view;

import com.sun.deploy.ref.AppModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ${DX} on 2018/9/2.
 */
public class WebViewController {


    @FXML
    private Button takeout;
    @FXML
    private Button next;
    @FXML
    private Button pre;
    @FXML
    private WebView web;
    @FXML
    private  Label weblab;


    private WebEngine webEngine;

    private ArrayList<String> urls=new ArrayList<>();

    private int index;

    public WebViewController(){
        Context.controllers.put(this.getClass().getSimpleName(), this);
    }

    @FXML
    public void takeButtonClick(ActionEvent actionEvent) {

        Random r=new Random();
        index=r.nextInt(urls.size());
        String URL=urls.get(index);

        String url=getClass().getResource("../resources/"+URL).toExternalForm();

        webEngine.load(url);
    }
    @FXML
    public void initialize(){

        webEngine = web.getEngine();
        File f=new File("src/com/luffyxin/resources");
        File fs[]=f.listFiles();
        for(File ff:fs){
            urls.add(ff.getName());
        }
    }

    @FXML
    public void preClick(ActionEvent actionEvent) {
        if(index==0)index=urls.size()-1;
        else index-=1;

        String URL=urls.get(index);

        String url=getClass().getResource("../resources/"+URL).toExternalForm();

        webEngine.load(url);
    }

    @FXML
    public void nextClick(ActionEvent actionEvent) {
        if(index==urls.size()-1)index=0;
        else index+=1;

        String URL=urls.get(index);

        String url=getClass().getResource("../resources/"+URL).toExternalForm();

        webEngine.load(url);
    }
}
