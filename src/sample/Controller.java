package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {

    public TextArea MainArea;
    public TextField message;

    public void Send(ActionEvent actionEvent) {

        String letter = message.getText();
        MainArea.appendText(letter + "\n");
        message.clear();
    }

}
