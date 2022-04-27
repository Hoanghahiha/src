package CanteenMs;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeController {
    public void nhanVienModule(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("nhanvien.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}
