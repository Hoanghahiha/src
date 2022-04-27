package library;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BookFormController {
    public final static String connectionString = "jdbc:mysql://localhost:3306/T2108M";
    public final static String user = "root";
    public final static String password = "";

    public TextField bName;
    public TextField bPublisher;
    public TextField bPubishDate;
    public TextField bAuthor;
    public TextField bPrice;

    public void backBooks() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("books.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }


    public void submit(ActionEvent event) {
        String bookName = this.bName.getText();
        String publisher = this.bPublisher.getText();
        String publishDate = this.bPubishDate.getText();
        String author = this.bAuthor.getText();
        Integer price = Integer.valueOf(this.bPrice.getText());


        String sql_txt = "insert into Books (bookName,publisher,publishDate,author,price) " +
                " values('"+bookName+"','"+publisher+"','"+publishDate+"','"+author+"','"+price+"')";
        System.out.println(sql_txt);
        try {
            // goi driver
            Class.forName("com.mysql.jdbc.Driver");
            // tao connect
            Connection conn = DriverManager.getConnection(connectionString,user,password);
            // khai bao Statement de truy van sql
            Statement stt = conn.createStatement();
            // insert
            stt.execute(sql_txt);
            this.backBooks();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
