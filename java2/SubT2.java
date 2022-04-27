package java2;

public class SubT2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("SubT2 i =" + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
