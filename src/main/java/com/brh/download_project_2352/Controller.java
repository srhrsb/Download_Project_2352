package com.brh.download_project_2352;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    @FXML
    private TextField urlTf;

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

    }
}
