module com.brh.download_project_2352 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.brh.download_project_2352 to javafx.fxml;
    exports com.brh.download_project_2352;
}