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

public class Teacher {
    private ObjectProperty<Integer> id;
    private StringProperty name;
    private StringProperty dob;
    private ObjectProperty<Integer> ssid;

   public Teacher(){
        id = new SimpleObjectProperty<>(null);
        name= new SimpleStringProperty("name");
        dob = new SimpleStringProperty("dob");
        ssid = new SimpleObjectProperty<>(0);
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

    public String getDob() {
        return dob.get();
    }

    public StringProperty dobProperty() {
        return dob;
    }

    public Integer getSsid() {
        return ssid.get();
    }

    public ObjectProperty<Integer> ssidProperty() {
        return ssid;
    }

    public void setId(Integer id) {
        this.id.set(id);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setDob(String dob) {
        this.dob.set(dob);
    }

    public void setSsid(Integer ssid) {
        this.ssid.set(ssid);
    }
    public static ObservableList<Teacher> selectAll(){
       ObservableList<Teacher> teachers = FXCollections.observableArrayList();
       try (
               Connection connection = data.dbConnect.getConnection2();
               Statement statement =connection.createStatement();
               ResultSet resultSet=statement.executeQuery("SELECT *FROM  teacher");){
           while(resultSet.next()){
               Teacher teacher = new Teacher();
               teacher.setId(resultSet.getInt("id"));
               teacher.setName(resultSet.getString("name"));
               teacher.setDob(resultSet.getString("dob"));
               teacher.setSsid(resultSet.getInt("ssid"));
               teachers.add(teacher);
           }
       }
        catch (SQLException e) {
           e.printStackTrace();
       }
       return teachers;
    }
}
