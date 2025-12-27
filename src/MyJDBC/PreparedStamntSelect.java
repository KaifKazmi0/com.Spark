package MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStamntSelect {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/practice_db";
            String username = "student";
            String password ="Stud@123";
            Connection con = DriverManager.getConnection(url,username,password);
            String qry = "SELECT * FROM customers WHERE id=?";
            PreparedStatement pstmt = con.prepareStatement(qry);

            pstmt.setInt(1,7);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("id")+" "
                        +rs.getString("first_name")+" "
                        +rs.getString("country")+" "
                        +rs.getString("score")+" "
                        +rs.getInt(1));
            }
            pstmt.setInt(1,8);
            rs = pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("id")+" "
                        +rs.getString("first_name")+" "
                        +rs.getString("country")+" "
                        +rs.getString("score")+" "
                        +rs.getInt(1));
            }


            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
