package session3;

public class Vietnamese extends Asia{
    public String telephone; //default, private, protected, public
    // nap chong, da hinh
    public void drink(){
        System.out.println("Drink vodka....");
    }

    public void drink(int money){
        System.out.println("Drink Chivas....");
    }

    public void drink(double balance){
        System.out.println("Drink drum....");
    }

    public void study(){
        System.out.println("Vn Study");
        System.out.println("Vn Study");
        System.out.println("Vn Study");
        System.out.println("Vn Study");
        System.out.println("Vn Study");
        System.out.println("Vn Study");

    }

    public Vietnamese(){

    }

    public Vietnamese(String telephone){
        this.telephone = telephone;
    }
}
