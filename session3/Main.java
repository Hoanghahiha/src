package session3;

public class Main {
    public static void main(String args[]){
        Human h = new Human();
        h.name = "Bui Huy Lac";
        h.run();
        Asia a = new Asia();
        a.name = "Thich di choi";
        a.run();
        a.say();
        Vietnamese v = new Vietnamese();
        v.name = "Ta Hoang Ha";
        v.run();
        v.say();

        v.telephone = "1243434";

        v.drink();
        v.drink(13);
        v.drink(3.14);

        Vietnamese v1 = new Vietnamese();
        Vietnamese v2 = new Vietnamese("938589493");
    }

}
