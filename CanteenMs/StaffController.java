package CanteenMs;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class StaffController implements Initializable {
    public TableView<Staff> tbStaff;
    public TableColumn<Staff,String> sName;
    public TableColumn<Staff,String> sNgaySinh;
    public TableColumn<Staff,String> sAddress;
    public TableColumn<Staff,String> sPhone;
    public TableColumn<Staff, Button> sAction;
    public TableColumn<Staff, Button> sDelete;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sName.setCellValueFactory(new PropertyValueFactory<>("TenNV"));
        sNgaySinh.setCellValueFactory(new PropertyValueFactory<>("NgaySinh"));
        sPhone.setCellValueFactory(new PropertyValueFactory<>("SDT"));
        sAddress.setCellValueFactory(new PropertyValueFactory<>("DiaChi"));
        sAction.setCellValueFactory(new PropertyValueFactory<>("editBtn"));
        sDelete.setCellValueFactory(new PropertyValueFactory<>("deleteBtn"));

        // get data from mysql
        try {
            StaffRepository sr = new StaffRepository();
            ArrayList<Staff> as = sr.list();

            ObservableList<Staff> list = FXCollections.observableArrayList();
            list.addAll(as);
            tbStaff.setItems(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void backHome(ActionEvent event)  throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void addStaff(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("staffForm.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}