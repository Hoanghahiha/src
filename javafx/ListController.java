package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class ListController implements Initializable {
    //    public Text listView;
    public TableView<Person> tbView;
    public TableColumn<Person,String> cName;
    public TableColumn<Person,String> cEmail;
    public TableColumn<Person,Integer> cAge;
    public TableColumn<Person, Button> cEdit;

    public TextField txtSearch;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<Person,String>("fullname"));
        cEmail.setCellValueFactory(new PropertyValueFactory<Person,String>("email"));
        cAge.setCellValueFactory(new PropertyValueFactory<Person,Integer>("age"));
        cEdit.setCellValueFactory(new PropertyValueFactory<Person,Button>("edit"));
        tbView.setItems(Main.personList);
    }

    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void search(){
        String s = txtSearch.getText();
        List<Person> kq = Main.personList.stream()
                .filter(p->p.getFullname().contains(s)
                        || p.getEmail().contains(s))
                .collect(Collectors.toList());
        ObservableList result = FXCollections.observableArrayList();
        result.addAll(kq);
        tbView.setItems(result);
    }
}