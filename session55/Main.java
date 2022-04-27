package session55;

public class Main {
    public static void main(String args[]){
        animal anl =new animal(){
            @Override
            public void run() {
                System.out.println("Run...");
            }
        };
        anl.run();
        Bird brd = new Bird() {
            @Override
            public void fly() {
                System.out.println("Fly...");
            }

            @Override
            public void eat() {
                System.out.println("Eat...");
            }
        };
        brd.fly();

        //lamda expression
        IHuman ih = (String s) ->{
            System.out.println("Study");
        };

        DaiBang d = new DaiBang();
        d.fly().fly2().run(); //stream
    }
}
