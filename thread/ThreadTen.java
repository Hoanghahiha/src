package thread;

import java2.SubT1;

public class ThreadTen extends Thread{
    @Override
    public void run() {

        for (int i = 0; i < 21; i+=2){
            System.out.println(Thread.currentThread().getName()+" i =" + i);
        }
    }
}
