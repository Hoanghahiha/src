package session10;
import java.sql.*;
public class DemoSQl {
    public final static String connectionString = "jdbc:mysql://localhost:3306/T2108M";
    public final static String user = "root";
    public final static String password = "";

    public static void main(String args[]){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //tao connect
            Connection conn = DriverManager.getConnection(connectionString,user,password);
            //khai bao statement de truy van sql
            Statement stt = conn.createStatement();
            //Truy van sql
            String txt_sql = "select * from person";
            ResultSet rs = stt.executeQuery(txt_sql);

            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("fullname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getInt("age"));
            }

                String insert_sql = "insert into person(fullname,email,age) values('HaHa','haha@gmail.com','23')";
                stt.execute(insert_sql);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
