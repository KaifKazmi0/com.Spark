package MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStamntInsert {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/practice_db";
            String username = "student";
            String password ="Stud@123";
            Connection con = DriverManager.getConnection(url,username,password);
            String qry = "INSERT INTO customers (id,first_name,country,score) VALUES (?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(qry);

            pstmt.setInt(1,12);
            pstmt.setString(2,"Kaif");
            pstmt.setString(3,"Germany");
            pstmt.setString(4,"342");
            pstmt.executeUpdate();

            pstmt.setInt(1,13);
            pstmt.setString(2,"Kumail");
            pstmt.setString(3,"India");
            pstmt.setString(4,"454");
            pstmt.executeUpdate();


            System.out.println("multiple rows inserted");
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
