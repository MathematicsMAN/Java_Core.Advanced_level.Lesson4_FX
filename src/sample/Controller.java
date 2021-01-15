package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Date;

public class Controller {

    @FXML
    private TextArea messagesTextArea;

    @FXML
    private TextField inputTextField;

    @FXML
    public void pressedAbout(ActionEvent event) {
        System.out.println("Author of this chat - Aleev Damir");
    }

    @FXML
    public void sendMessage(ActionEvent event) {
        Date date = new Date(System.currentTimeMillis());
        String dateToString = String.format("%1$td %1$tB %1$tY %1$tH:%1$tM:%1$tS ", date);
        messagesTextArea.setText(messagesTextArea.getText() +
                                dateToString + "\n" +
                                inputTextField.getText() + "\n--------------\n");
        inputTextField.setText("");
    }

    @FXML
    public void pressedClose(ActionEvent actionEvent) {
        System.exit(0);
    }
}
