package jp2.session;

public class DemoGeneric {
    public static void main(String args[]){
        Moto<String,String> honda = new Moto<>("az123","sm321");
        String s1 = honda.getSoKhung();
        System.out.println(s1);

        Moto<Integer,String> yamaha = new Moto<>(123,"ds345");
        Integer i1 = yamaha.getSoKhung();
        System.out.println(i1);

        yamaha.showInfo("adf");
        yamaha.showInfo(123);
        yamaha.showInfo(3.13);

        Yamaha<Integer,Car> y1 = new Yamaha<>();
        y1.setSoMay(new Car(1,"t123232"));


    }
}
