package com.brh.download_project_2352;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    @FXML
    private ListView<String> downloadList;

    @FXML
    private TextField targetTf;


    @FXML
    protected void onSearch(ActionEvent actionEvent) {
        Stage stage = App.getStage();

        DirectoryChooser directory = new DirectoryChooser();
        File path = directory.showDialog(stage);

        if(path != null) {
            targetTf.setText(path.getAbsolutePath());
        }
    }

    @FXML
    protected void onDownload(ActionEvent actionEvent) {

             // ToDo: ListView Einträge in iterierbare
             // Listenstruktur bringen und die einzelnen
             // Pfade rausholen

//           String target = targetTf.getText();
//
//           if( url.isBlank() || target.isBlank() ) return;
//
//           Download download = new Download(url, target);
//           download.start();
    }
}
