package CanteenMs;

import database.Connector;

import java.sql.*;
import java.util.ArrayList;

public class StaffRepository implements IStaffInterface {
    @Override
    public ArrayList<Staff> list() {
        try {
            String txt_sql = "select * from Staff";
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(txt_sql);
            ResultSet rs = stt.executeQuery();
            ArrayList<Staff> list = new ArrayList<>();
            while (rs.next()) {
                Staff s = new Staff(
                        rs.getInt("idNV"),
                        rs.getString("TenNV"),
                        Date.valueOf(rs.getString("NgaySinh")),
                        rs.getString("SDT"),
                        rs.getString("DiaChi")
                );
                list.add(s);
            }
            return list;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void create(Staff staff) {
        String sql_txt = "insert into staff (TenNV,NgaySinh,SDT,DiaChi) values(?,?,?,?)";
        try {
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(sql_txt);
            stt.setString(1,staff.getTenNV());
            stt.setString(2,staff.getNgaySinh().toString());
            stt.setString(3,staff.getSDT());
            stt.setString(4,staff.getDiaChi());
            stt.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Staff staff) {
        String sql_txt = "update staff set TenNV=?,NgaySinh=?,SDT=?,DiaChi=? where idNV=?";
        try {
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(sql_txt);
            stt.setString(1,staff.getTenNV());
            stt.setString(2,staff.getNgaySinh().toString());
            stt.setString(3,staff.getSDT());
            stt.setString(4,staff.getDiaChi());
            stt.setString(5,staff.getIdNV().toString());
            stt.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Staff staff) {
        String sql_txt = "delete from staff where id=?";
        try {
            Connector conn = Connector.getInstance();
            PreparedStatement stt = conn.getStatement(sql_txt);
            stt.setInt(1,staff.getIdNV());
            stt.execute();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}