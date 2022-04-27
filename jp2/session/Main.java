package jp2.session;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        int x = 0;
        try {
            x += 10; //local variable

        } catch (ArithmeticException e) {
        } catch (Exception e) {

        } finally {
            x += 10;
        }

//        66666666666666666666666666
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(3);
        hs.add(5);
        hs.add(3);
        for (Integer i:hs){
            System.out.println(i);
        }

//        Integer[] it = new Integer[10];
       Scanner sc = new Scanner(System.in);
//        for (int i = 0;i<10;i++ ){
//            it[i] = sc.nextInt();
//            boolean f = false;
//            for (int j = 0;j<i;j++){
//                if (it[j]==it[i]){
//                    f = true;
//                    break;
//                }
//            }
//            if (f){
//                i--;
//            }
//        }
//        HashSet<Integer> hsI = new HashSet<>();
//        while (hsI.size()<10){
//            hsI.add(sc.nextInt());
//        }

//        PriorityQueue<Integer> pqI = new PriorityQueue<>();
//        pqI.add(9);
//        pqI.add(3);
//        pqI.add(4);
//        while (pqI.size()>0){
//            int n = pqI.poll();
//            System.out.println("Queue:"+n);
//        }

        PriorityQueue<Integer> pqI = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        pqI.add(9);
        pqI.add(3);
        pqI.add(4);
        while (pqI.size()>0){
            int n = pqI.poll();
            System.out.println("Queue:"+n);
        }

        PriorityQueue<Car> cp = new PriorityQueue<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        cp.add(new Car(1,"Toyota"));
        cp.add(new Car(2,"HuynDai"));
        cp.add(new Car(3,"Nexus"));

        while (cp.size()>0){
            System.out.println(cp.poll().toString());
        }


        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("no1",20);
        hm.put("no2",30);

        hm.get("no1");

    }
}
