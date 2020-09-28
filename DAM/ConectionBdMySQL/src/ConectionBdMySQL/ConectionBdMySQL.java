

package ConectionBdMySQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * @author Fernandez
 */
public class ConectionBdMySQL {

   private static Connection conn;
   private static final String driver = "com.mysql.cj.jdbc.Driver";
   private static final String user = "root";
   private static final String password = "1234";
   private static final String url = "jdbc:mysql://localhost:3306/Alumnos?serverTimezone=UTC&useSSL=false";
           
   public ConectionBdMySQL(){
       conn = null;
       
       try{
           Class.forName(driver);
           conn = DriverManager.getConnection(url,user,password);
           
           if(conn != null){
               System.out.println("Conexión establecida...");
           }
           
       }catch(ClassNotFoundException | SQLException e){
           System.out.println("Error al conectar " + e);
       }
   }
   public Connection getConnection(){
       return conn;
   }
   public void desconectar(){
       conn = null;
       if(conn == null){
           System.out.println("Conexión terminada...");
       }
   }
}
