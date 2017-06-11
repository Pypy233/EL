/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author py
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
public class MusicController extends Application{
    public String music1 = "";
    public String music2 = "";
    public String music3 = "";
    @Override
    public void start(Stage primaryStage){
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
        Button btMusic1 = new Button(music1);
        Button btMusic2 = new Button(music2);
        Button btMusic3 = new Button(music3);
        
        btMusic1.setOnAction((ActionEvent e)->{
            primaryStage.close();
           
            Set set  = new Set();
            set.start(primaryStage);
            set.setMusic(music1);
            
        });
         btMusic1.setOnAction((ActionEvent e)->{
            primaryStage.close();
            Set set  = new Set();
            set.start(primaryStage);
            set.setMusic(music2);
           
        });
         btMusic1.setOnAction((ActionEvent e)->{
            primaryStage.close();
            Set set  = new Set();
            set.start(primaryStage);
            set.setMusic(music2);
           
        });
        
        
        pane.add(btMusic1, 0, 0);
        pane.add(btMusic2, 0, 1);
        pane.add(btMusic3, 0, 2);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
