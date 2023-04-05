
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

 
public class Conexion {
    
    String bd="hilitosdeoro";
    String url="jdbc:mysql://localhost:3306/" + bd;
    String user="root";
    String password="";
    Connection con = null;

    public Connection getConexion() {
       try{
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           con =  DriverManager.getConnection(this.url, this.user, this.password);
           
       } catch(SQLException ex)
       {
          JOptionPane.showMessageDialog(null, "Error de conexion: " + ex.getMessage(), "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return con;
    }
    
}
