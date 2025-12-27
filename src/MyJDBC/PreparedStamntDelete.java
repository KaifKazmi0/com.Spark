package MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStamntDelete {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/practice_db";
            String username = "student";
            String password ="Stud@123";
            Connection con = DriverManager.getConnection(url,username,password);
            String qry = "DELETE FROM customers WHERE id=?";
            PreparedStatement pstmt = con.prepareStatement(qry);

            pstmt.setInt(1,12);
            pstmt.executeUpdate();

            pstmt.setInt(1,13);
            pstmt.executeUpdate();



            System.out.println("multiple rows deleted");
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
