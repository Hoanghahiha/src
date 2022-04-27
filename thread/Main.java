package thread;

import thread.ThreadTen;

public class Main {
    public static void main(String args[]){
        ThreadTen st1 = new ThreadTen();
        st1.setName("Thread ST1");
        st1.run();
        System.out.println("MyThread");
    }
}
