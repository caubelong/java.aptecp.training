package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.Navigator;

import java.io.IOException;


public class editController {
    @FXML
    private Button btnBack;

    @FXML
    private Button btnSubmit;

    @FXML
    private Button btnReset;
    @FXML
    void clickBack(ActionEvent event)throws IOException {
            Navigator.getInstance().goToIndexSubject();
    }

    @FXML
    void clickBackTeacher(ActionEvent event) throws IOException{
        Navigator.getInstance().goToIndexTeacher();
    }

}
