package session2;

import java.util.Scanner;

public class Sinhvien { // Khai bao mot lop Sinhvien
    String name;
    int age;
    Classrom myClass;

    public Sinhvien(){ //Constructor Ham khoi tao
        System.out.println("Contructor running");
        this.inputname();
    }

    void study(){
        System.out.println(this.name + "lop:"  + this.myClass + " Study");
    }

    void inputname(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }
}
