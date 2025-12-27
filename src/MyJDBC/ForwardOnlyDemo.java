package MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ForwardOnlyDemo {
    public static void main(String[] args) {
        try{
            String qry = "SELECT * FROM customers";
            String url = "jdbc:mysql://localhost:3306/practice_db";
            String username = "student";
            String password = "Stud@123";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            ResultSet res =  st.executeQuery(qry);


            System.out.printf("%-5s %-10s %-10s %-5s%n",
                    "ID", "NAME", "COUNTRY", "SCORE");
            System.out.println("--------------------------------");

            while (res.next()) {
                System.out.printf("%-5d %-10s %-10s %-5d%n",
                        res.getInt("id"),
                        res.getString("first_name"),
                        res.getString("country"),
                        res.getInt("score"));
            }



            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
