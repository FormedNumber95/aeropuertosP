module es.aketzagonzalez {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens es.aketzagonzalez.aeropuertosP to javafx.fxml;
    exports es.aketzagonzalez.aeropuertosP;
}