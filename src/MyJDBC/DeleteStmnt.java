package MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStmnt {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/practice_db";
            String user = "student";
            String password = "Stud@123";
            Connection con = DriverManager.getConnection(url,user,password);
            Statement st = con.createStatement();

            String qry = "DELETE FROM customers WHERE first_name='Arif'";
            int num = st.executeUpdate(qry);
            System.out.println("Deleted "+num+ " Rows");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
