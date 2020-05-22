package sample;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigator {
    public static final String INDEX_Subject_FXML ="subject.fxml";
    public static final String INDEX_Teacher_FXML ="teacher.fxml";
    public static final String EDIT_Subject_FXML ="editSubject.fxml";
    public static final String EDIT_Teacher_FXML ="editTeacher.fxml";

    private FXMLLoader loader;
    private Stage stage =null;
    private static  Navigator nav=null;

    private Navigator(){

    }
    public static Navigator getInstance(){
        if(nav == null){
            nav = new Navigator();
        }
        return  nav;
    }
    public void setStage(Stage stage){
        this.stage=stage;
    }
    public Stage getStage(){
        return stage;
    }
    private void goTo(String fxml) throws IOException {
        this.loader= new FXMLLoader();
        loader.setLocation(getClass().getResource(fxml));
        Parent root=loader.load();
        Scene scene = new Scene(root);
        this.stage.setScene(scene);
    }
    public void goToIndexSubject()throws  IOException{
        this.goTo(INDEX_Subject_FXML);
    }
    public void goToIndexTeacher() throws  IOException{
        this.goTo(INDEX_Teacher_FXML);
    }
    public void gotoEditSubject() throws  IOException{
        this.goTo(EDIT_Subject_FXML);
    }
    public void gotoEditTeacher() throws  IOException{
        this.goTo(EDIT_Teacher_FXML);
    }


}
