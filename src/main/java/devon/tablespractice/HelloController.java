package devon.tablespractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public Label TheLabel;
    public int count = 1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am initialized");
    }

    public void onbuttonClicked(ActionEvent actionEvent){
        System.out.println("You clicked me!");
        TheLabel.setText("You clicked the button : " + count++);
    }
}