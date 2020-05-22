package sample;

import data.dbConnect;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Subject {
//    private int id ;
//    private String name;
//    private String duration;
//    private String level;

    private ObjectProperty<Integer> id;
    private StringProperty name;
    private ObjectProperty<Integer> duration;
    private StringProperty level;

    public Subject(){
        id=new SimpleObjectProperty<>(null);
        name= new SimpleStringProperty();
        duration = new SimpleObjectProperty<>(0);
        level = new SimpleStringProperty();

    }

    public Integer getId() {
        return id.get();
    }

    public ObjectProperty<Integer> idProperty() {
        return id;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public Integer getDuration() {
        return duration.get();
    }

    public ObjectProperty<Integer> durationProperty() {
        return duration;
    }

    public String getLevel() {
        return level.get();
    }

    public StringProperty levelProperty() {
        return level;
    }

    public void setId(Integer id) {
        this.id.set(id);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setDuration(Integer duration) {
        this.duration.set(duration);
    }

    public void setLevel(String level) {
        this.level.set(level);
    }

    public static ObservableList<Subject> selectAll(){
        ObservableList<Subject>subjects = FXCollections.observableArrayList();

        try (
                Connection connection = data.dbConnect.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM Subject");){
            while (resultSet.next()){
                    Subject subject = new Subject();
                    subject.setId(resultSet.getInt("id"));
                    subject.setName(resultSet.getString("name"));
                    subject.setDuration(resultSet.getInt("duration"));
                    subject.setLevel(resultSet.getString("level"));

                    subjects.add(subject);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subjects;
    }
}
