package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.Navigator;
import sample.Subject;

import java.io.IOException;

public class controllerSubject {
    @FXML
    private TableView<Subject> sbTable;

    @FXML
    private TableColumn<Subject, String> sjName;

    @FXML
    private TableColumn<Subject, Integer> sjDuration;

    @FXML
    private TableColumn<Subject, String> sjLevel;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;


    public  void initialize(){
        System.out.println("subject controller initialize");
        sbTable.setItems(Subject.selectAll());
        sjName.setCellValueFactory((Subject)->{
            return Subject.getValue().nameProperty();
        });
        sjDuration.setCellValueFactory((Subject)->{
            return Subject.getValue().durationProperty();
        });
        sjLevel.setCellValueFactory((Subject)->{
            return Subject.getValue().levelProperty();
        });
    }
    @FXML
    void insertSubject(ActionEvent event) throws IOException {
            Navigator.getInstance().gotoEditSubject();
    }

}
