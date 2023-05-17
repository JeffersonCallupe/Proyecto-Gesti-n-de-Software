package bdMYSQL;
import java.sql.*;

public class ConexionBD {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/SistemaVentas";
    
    String username = "root";
    String password = "root";
    
    Connection conn = null;
    
    public Connection conectar()
    {
        try
        {
            conn = DriverManager.getConnection(url, username, password);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return conn;
    }
}
