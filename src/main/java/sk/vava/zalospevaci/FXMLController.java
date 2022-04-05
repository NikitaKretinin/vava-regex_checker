package sk.vava.zalospevaci;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class FXMLController {

    @FXML
    private Button checkBtn;
    @FXML
    private TextField regexTF;
    @FXML
    private TextArea textArea;
    @FXML
    private Label result;

    public void checkRegEx(MouseEvent mouseEvent){
        if (regexTF.getText().isEmpty()) {
            result.setText("Regex pattern not found");
            result.setTextFill(Color.RED);
        } else if (textArea.getText().isEmpty()) {
            result.setText("Text not found");
            result.setTextFill(Color.RED);
        }

        Pattern pattern = Pattern.compile(regexTF.getText());
        Matcher matcher = pattern.matcher(textArea.getText());
        if (matcher.find()) {
            result.setText("OK");
            result.setTextFill(Color.GREEN);
        } else {
            result.setText("NG");
            result.setTextFill(Color.RED);
        }
    }
}