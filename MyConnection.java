package loginandsignup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author RASHIKA GUPTA
 */
public class MyConnection {
    //create a function to connect with mysql database
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_login_signup","root","");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
