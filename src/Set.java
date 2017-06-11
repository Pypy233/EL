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
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Set extends Application{
     public String MEDIA_URL = "http://cs.armstrong.edu/liang/common/sample.mp4";
    @Override
    public void start(Stage primaryStage){
      
        GridPane pane = new GridPane();
       
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
        Button btMusic = new Button("Music");
        Button btExit = new Button("Exit");
        
        btExit.setOnAction((ActionEvent e) -> {
    System.exit(0);});
        
        btMusic.setOnAction((ActionEvent e )->{
            primaryStage.close();
            MusicController mc = new MusicController();
           mc.start(primaryStage);
           
        });
           Media media = new Media(MEDIA_URL);
       MediaPlayer mediaPlayer = new MediaPlayer(media);
        
        Slider slider = new Slider();
        slider.setOrientation(Orientation.HORIZONTAL);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setValue(100);
        
     mediaPlayer.volumeProperty().bind(slider.valueProperty().divide(100));
       
       pane.add(btMusic, 0, 0);
       pane.add(slider,0,1);
       pane.add(btExit,0,2);
       Scene scene = new Scene(pane);
       primaryStage.setTitle("Settings");
       primaryStage.setScene(scene);
       primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
    public  void setMusic(String MEDIA_URL){
        this.MEDIA_URL = MEDIA_URL;
    }
    public String getMusic(){
        return MEDIA_URL;
    }
    
}
