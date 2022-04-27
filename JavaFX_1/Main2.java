package JavaFX_1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {
    public static ObservableList<Product> productList = FXCollections.observableArrayList();
    public static Stage rootStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("listp.fxml"));
        primaryStage.setTitle("Quan li SP");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        productList.add(new Product("May tinh dell",200,18000000,1));
        productList.add(new Product("May tinh Asus",201,28000000,2));
        launch(args);
    }
}
