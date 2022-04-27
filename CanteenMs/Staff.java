package CanteenMs;

import QuanliDt.MainDT;
import QuanliDt.PhoneNumber;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.sql.Date;
import java.util.ArrayList;

public class Staff {
    public Integer idNV ;
    public String TenNV;
    public Date NgaySinh;
    public String SDT;
    public String DiaChi;
    public Button editBtn;
    public Button deleteBtn;

    public Staff(Integer idNV, String TenNV, Date NgaySinh, String SDT, String DiaChi) {
        this.idNV = idNV;
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;

        this.deleteBtn = new Button("Delete");
        this.deleteBtn.setOnAction(event -> {

        });

        this.editBtn = new Button("Edit");
        this.editBtn.setOnAction((event)->{
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("staffForm.fxml"));
                Parent root = loader.load();
                StaffFormController d = loader.getController();
                d.setEditData(this);
                Main.rootStage.setScene(new Scene(root,800,600));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
    }

    public Button getEditBtn() {
        return editBtn;
    }

    public void setEditBtn(Button editBtn) {
        this.editBtn = editBtn;
    }

    public Integer getIdNV() {
        return idNV;
    }

    public void setIdNV(Integer idNV) {
        this.idNV = idNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public Button getDeleteBtn() {
        return deleteBtn;
    }

    public void setDeleteBtn(Button deleteBtn) {
        this.deleteBtn = deleteBtn;
    }
}