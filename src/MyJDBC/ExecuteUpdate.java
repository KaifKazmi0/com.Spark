package MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdate {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/practice_db";
            String username = "student";
            String password = "Stud@123";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();


           String qry = "INSERT INTO customers (Id ,first_name,country,score) VALUES (6,'Kaif','India','85')";
            st.executeUpdate(qry);



            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
