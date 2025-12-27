package MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsensitiveDemo {
    public static void main(String[] args) {
        try{
            String qry = "SELECT * FROM customers";
            String url = "jdbc:mysql://localhost:3306/practice_db";
            String username = "student";
            String password = "Stud@123";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet res =  st.executeQuery(qry);

            System.out.println("--------------------------------");

            res.last();
            System.out.println(res.getInt("id")+" "+res.getString("first_name"));

            res.first();
            System.out.println(res.getInt("id")+" "+res.getString("first_name"));

            res.absolute(3);
            System.out.println(res.getInt("id")+" "+res.getString("first_name"));

            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
