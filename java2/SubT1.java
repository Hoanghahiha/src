package java2;

public class SubT1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName()+" i =" + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
