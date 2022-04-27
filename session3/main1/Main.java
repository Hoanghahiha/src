package session3.main1;

import session3.Vietnamese;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList arl = new ArrayList();
        arl.add(1);
        arl.add("Hello");
        //arl.add(new SinhVien());

        // qui dinh kieu du lieu cua phan tu
        ArrayList<Integer> arrNum = new ArrayList<Integer>();
        arrNum.add(8);
        arrNum.add(4);
        //arrNum.add(3.14);
        //arrNum.add("hello")
        ArrayList<String> arrS = new ArrayList<String>();

        System.out.println("arrNum[0]" + arrNum.get(0));
        arrNum.remove(2);
        Vietnamese v1 = new Vietnamese();
        // v1.telephone = "1111";
    }
}
