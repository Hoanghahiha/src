package CanteenMs;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.*;

public class StaffFormController {
    public final static String connectionString = "jdbc:mysql://localhost:3306/CANTEEN";
    public final static String user = "root";
    public final static String password = "";

    public TextField sName;
    public TextField sPhone;
    public TextField sBirthday;
    public TextArea sAddress;

    public Staff editData;

    public void setEditData(Staff editData){
        this.editData = editData;
        this.sName.setText(editData.getTenNV());
        this.sBirthday.setText(editData.getNgaySinh().toString());
        this.sPhone.setText(editData.getSDT());
        this.sAddress.setText(editData.getDiaChi());
    }

    public void backNhanVien() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("nhanvien.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }

//    public void submit(ActionEvent event) {
//        String name = this.sName.getText();
//        String birthday = this.sBirthday.getText();
//        String phone = this.sPhone.getText();
//        String address = this.sAddress.getText();
//        try {
//            StaffRepository sr = new StaffRepository();
//            if(this.editData == null) {
//                Staff s = new Staff(null,name,Date.valueOf(birthday),phone,address);
//                sr.create(s);
//            }else{
//                sr.update(this.editData);
//            }
//            this.backNhanVien();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
public void submit(ActionEvent event) {
    String name = this.sName.getText();
    String birthday = this.sBirthday.getText();
    String phone = this.sPhone.getText();
    String address = this.sAddress.getText();

    if(this.editData == null) {
        String sql_txt = "insert into Staff (TenNV,NgaySinh,SDT,DiaChi) " +
                " values('"+name+"','"+birthday+"','"+phone+"','"+address+"')";
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
            this.backNhanVien();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }else{
        String sql_txt = "update staff set TenNV='name' ,NgaySinh='birthday',SDT='phone',DiaChi='address' where idNV=idNV";
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
            this.backNhanVien();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

//    String sql_txt = "insert into Staff (TenNV,NgaySinh,SDT,DiaChi) " +
//            " values('"+name+"','"+birthday+"','"+phone+"','"+address+"')";
//    System.out.println(sql_txt);

}
}
