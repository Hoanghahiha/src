package session55.DemoException;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoException {
    public static ArrayList arr;
    public static void main(String args[]) throws Exception{
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y==0){
                throw new Exception("Nhap so 0 la sai roi");
            }

            x++;

            int z= x/y;
            System.out.println("z= "+ z);
            DemoException.arr.add(1);
        }catch (ArithmeticException e){
            System.out.println("Ari: "+ e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Null: "+ e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }finally {
            System.out.println("Finish");
        }
    }
}
