package MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/practice_db";
        String user = "student";
        String pass = "Stud@123";

        Connection con = DriverManager.getConnection(url, user, pass);
        System.out.println("Connected!");

        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO users(name) VALUES ('From JDBC')");
        ResultSet rs = st.executeQuery("SELECT CURRENT_USER()");

        while (rs.next()) {
            System.out.println(rs.getString(1));
        }

        con.close();
    }
}

