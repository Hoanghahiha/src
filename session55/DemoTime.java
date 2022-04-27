package session55;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DemoTime {
    public static void main(String args[]){
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate ld2 = ld.plusDays(2);
        System.out.println(ld2);
        LocalDate ld3 = ld.plusYears(1);
        System.out.println(ld3);
        LocalDate ld4 = ld.minusWeeks(2);
        System.out.println(ld4);
        //
        LocalDate ld5 = LocalDate.of(2021,5,12);
        System.out.println(ld5);
        //2022-02-15
        LocalDate ld7 = LocalDate.parse("2022-02-13");
        System.out.println(ld7);
        //Nhap so nguyen kiem tra nam do phai nam nhuan hay khong

//        try {
//            Scanner sc = new Scanner(System.in);
//            int y = sc.nextInt();
//            LocalDate ld8 = LocalDate.of(y,2,29);
//            System.out.println("Nam"+ y+ "la nam nhuan");
//        }catch (Exception e){
//            System.out.println("Nam"+ y + "khong phai nam nhuan");
//        }
        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt);
        LocalDateTime lt2 = LocalDateTime.of(2022,2,21,17,77,55);
        System.out.println(lt2);
        LocalDateTime lt3 = LocalDateTime.parse("2021-01-12 T 17:25:30");
        System.out.println(lt3);
        LocalDateTime lt4 = lt3.minusHours(20);

    }
}
