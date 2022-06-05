module com.gamedemo.gameinventorydemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gamedemo.gameinventorydemo to javafx.fxml;
    exports com.gamedemo.gameinventorydemo;
}