
package conex;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Fernandez
 */
public class ConexionBD {
    
   Connection con;
   private static java.sql.Connection conn;
   private static final String driver = "com.mysql.cj.jdbc.Driver";
   private static final String user = "root";
   private static final String password = "1234";
   private static final String url = "jdbc:mysql://localhost:3306/alumnos?serverTimezone=UTC&useSSL=false";
   private static final String viewDB = "select * from alumnos";
   Statement st;
   ResultSet rs;
    
    public ConexionBD(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Conexión establecida...");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error de conexión " + e);
        }
    }
    
    public static void main(String[] args) {
        ConexionBD cn = new ConexionBD();
        Statement st;
        ResultSet rs;
        String query = "select * from alumnos";
        
        try {
            st = cn.con.createStatement();
            rs =  st.executeQuery(query);
            
            while(rs.next()){
                System.out.println(rs.getString("Login") + (" | ") + rs.getString("Password") + (" | ") + rs.getString("Nombre") + (" | ") + rs.getString("Apellido") + (" | ") + rs.getString("Perfil")+ (" | "));
            }
            
            System.out.println("Conexión terminada...");
            cn.con.close();
        } catch (SQLException e) {
            System.err.println("Error de conexión " + e);
        }
        
    }
}
