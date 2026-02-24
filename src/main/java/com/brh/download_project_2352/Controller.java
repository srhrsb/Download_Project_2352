package com.brh.download_project_2352;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Controller {
    @FXML
    private ListView<String> downloadList;

    @FXML
    private TextField targetTf;

    @FXML
    private TextField urlTf;

    private int totalProgress;

    /**
     * Öffnet Ordner-Dialog und gibt den Pfad oder null zurück
     * @param actionEvent - Event auf Klick
     */
    @FXML
    protected void onSearch(ActionEvent actionEvent) {
        Stage stage = App.getStage();

        DirectoryChooser directory = new DirectoryChooser();
        File path = directory.showDialog(stage);

        if(path != null) {
            targetTf.setText(path.getAbsolutePath());
        }
    }

    /**
     * Startet die Downloads der Download-Tabelle
     * @param actionEvent Event auf Klick
     */
    @FXML
    protected void onDownload(ActionEvent actionEvent) {

          String target = targetTf.getText();
          var list = downloadList.getItems();

          for( var url : list ){
              if( url.isBlank() || target.isBlank() ) continue;
              Download download = new Download(url, target, this);
              download.start();
          }
    }

    /**
     * Url der Download-Tabelle hinzugefügt
     * @param actionEvent Klickevent
     */
    @FXML
    protected void onAddUrl(ActionEvent actionEvent) {
           String url = urlTf.getText();
           if(!validateUrl(url)) return;
           downloadList.getItems().add(url);
    }

    /**
     * Prüft ob eine gegebene Url valide ist
     * @param url url die geprüft werden soll
     * @return true, wenn valide
     */
    private boolean validateUrl( String url ){
        try {
            new URL(url);
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }


    public void addProgress( int progress ){
        totalProgress += progress;
        //Todo Progress im Label ausgeben



    }
}
