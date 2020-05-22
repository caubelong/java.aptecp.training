package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.Navigator;
import sample.Teacher;

import java.io.IOException;

public class controllerTeacher {

    @FXML
    private TableView<Teacher> tcTable;

    @FXML
    private TableColumn<Teacher, String> tcName;

    @FXML
    private TableColumn<Teacher, String> tcDob;

    @FXML
    private TableColumn<Teacher, Integer> tcSsid;

    public void initialize(){
        System.out.println("select sucssess");
        tcTable.setItems(Teacher.selectAll());
        tcName.setCellValueFactory((Teacher)->{
            return Teacher.getValue().nameProperty();
        });
        tcDob.setCellValueFactory((Teacher)->{
            return Teacher.getValue().dobProperty();
        });
        tcSsid.setCellValueFactory((Teacher)->{
            return Teacher.getValue().ssidProperty();
        });
    }
    @FXML
    void editTeacher(ActionEvent event) throws IOException {
        Navigator.getInstance().gotoEditTeacher();
    }

}
