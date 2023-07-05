
package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author haya
 */
public class DBconnection {
    private static String name ="root";
    private static String pass= "";
    private static String add="jdbc:mysql://localhost:3306/blooddonantion";
    static String query;
    static Statement ss; 
    public Connection Connect() throws SQLException {
        Connection c= DriverManager.getConnection(add,name,pass);
        System.out.print("Connected Successfully");
        return c;
    }

  
  
  
  

}
