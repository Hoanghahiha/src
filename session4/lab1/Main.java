package session4.lab1;

import Assignment4.LopHoc;
import Assignment4.MonHocDaiCuong;

public class Main {
    public static void main(String args[]){
        MonHocDaiCuong dc = new MonHocDaiCuong();

        dc.themLopHoc("Duy","0911222333");
        dc.themLopHoc("Duy","0988777666");

        dc.themLopHoc("Lan","01828282828");
        dc.themLopHoc("Anh","01283844352");

        for (LopHoc dn : dc.DsLopHoc){
            System.out.println(dn.LopHoc);
            System.out.println(dn.Hocsinh);
        }

        dc.sapXep();
        for (LopHoc dn : dc.DsLopHoc){
            System.out.println(dn.LopHoc);
            System.out.println(dn.Hocsinh);
        }
    }
}