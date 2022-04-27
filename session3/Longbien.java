package session3;

public class Longbien extends Vietnamese {
    public void eat(){
        System.out.println("Tel: " + this.telephone );
    }

    public void drink(){
        System.out.println("Drink Ha noi");
    }

    public void study(){ // Ghi de
        super.study();
        super.drink();
        this.drink();
        System.out.println("LB Study");
    }
}
