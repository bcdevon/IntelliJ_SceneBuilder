module devon.tablespractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens devon.tablespractice to javafx.fxml;
    exports devon.tablespractice;
}