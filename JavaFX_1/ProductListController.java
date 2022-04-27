package JavaFX_1;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductListController implements Initializable {
    //    public Text listView;
    public TableView<Product> tbView;
    public TableColumn<Product,String> cTen;
    public TableColumn<Product,Integer> cGia;
    public TableColumn<Product,Integer> cDonVi;
    public TableColumn<Product,Integer> cSoLuong;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cTen.setCellValueFactory(new PropertyValueFactory<Product,String>("name"));
        cGia.setCellValueFactory(new PropertyValueFactory<Product,Integer>("price"));
        cDonVi.setCellValueFactory(new PropertyValueFactory<Product,Integer>("donVi"));
        cSoLuong.setCellValueFactory(new PropertyValueFactory<Product,Integer>("soLuong"));
        tbView.setItems(Main2.productList);
    }

    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("demo.fxml"));
        Main2.rootStage.setScene(new Scene(root,800,600));
    }
}