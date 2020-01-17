package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class SampleController {
    public TextArea textField;
    Parser parsPage = new Parser();

    public void updateButtonOnClick(ActionEvent actionEvent) {
        textField.setText(parsPage.getTextLine());
    }

    public void likeButtonOnClick(ActionEvent actionEvent) {

    }

    public void dislikeButtonOnClick(ActionEvent actionEvent) {

    }
}
