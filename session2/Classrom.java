package session2;

import java.util.Scanner;

public class Classrom {
    String Classname;
    int ClassRoll;
    String Schoolname;

    public Classrom(){
        this.inputinfo();
    }

    public void Date(){
        System.out.println(this.Classname + "Open 12/03/2020");
    }

    void inputinfo(){
        Scanner sc = new Scanner(System.in);
        this.Classname = sc.nextLine();
        this.ClassRoll = sc.nextInt();
        this.Schoolname = sc.nextLine();
    }
}
