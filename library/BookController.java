package library;

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
import java.util.ResourceBundle;

public class BookController implements Initializable {
    public TableView<Book> tbBooks;
    public TableColumn<Book,String> bName;
    public TableColumn<Book,String> bAuthor;
    public TableColumn<Book,String> bPublisher;
    public TableColumn<Book,String> bPublishDate;
    public TableColumn<Book,Integer> bPrice;
    public TableColumn<Book, Button> bAction;

    // tao cac string ket noi
    public final static String connectionString = "jdbc:mysql://localhost:3306/T2108M";
    public final static String user = "root";
    public final static String password = "";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bName.setCellValueFactory(new PropertyValueFactory<>("bookName"));
        bAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        bPublisher.setCellValueFactory(new PropertyValueFactory<>("publisher"));
        bPublishDate.setCellValueFactory(new PropertyValueFactory<>("publishdate"));
        bPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        // get data from mysql
        try {
            // goi driver
            Class.forName("com.mysql.jdbc.Driver");
            // tao connect
            Connection conn = DriverManager.getConnection(connectionString,user,password);
            // khai bao Statement de truy van sql
            Statement stt = conn.createStatement();
            // truy van sql
            String txt_sql = "select * from Books";
            ResultSet rs = stt.executeQuery(txt_sql);

            ObservableList<Book> listBook = FXCollections.observableArrayList();
            while (rs.next()){
                Book b = new Book(
                        rs.getInt("id"),
                        rs.getString("bookName"),
                        rs.getString("publishdate"),
                        rs.getString("author"),
                        rs.getString("publisher"),
                        Integer.valueOf(rs.getString("price"))
                );
                listBook.add(b);
            }
            tbBooks.setItems(listBook);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void backHome(ActionEvent event)  throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

    public void addBook(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("bookForm.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}