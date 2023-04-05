package Model;

import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author KROMERO
 */
public class ProductoDAO {
   Connection con;
   ResultSet rs;
   PreparedStatement ps;
   Conexion conectar = new Conexion();
   
   public int agregar(Producto producto){
       int r = 0;
       String sql = "insert into producto(IdProducto, NomProducto,VlrUnidad) values(?,?,?);";
        
       
       try{
           con = conectar.getConexion();
            ps = con.prepareStatement(sql); 
            ps.setInt(1,producto.getIdProducto());
            ps.setString(2,producto.getNomProducto());
            ps.setDouble(3,producto.getVlrUnidad());
            
            r = ps.executeUpdate();
            if(r == 1){
                return 1;
            }
            else
            {
                return 0;
            }
            
       
       }catch(SQLException ex){
              JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
        }
       
       return 0;
   }
    
    public List listar() {
     List<Producto> datos = new ArrayList<>();

     try {
         con = conectar.getConexion();
         ps = con.prepareStatement("select IdProducto,NomProducto,VlrUnidad from producto;");
         rs = ps.executeQuery();
         while (rs.next()) {
             Producto producto = new Producto(rs.getInt(1),rs.getString(2), rs.getDouble(3));
             datos.add(producto);
         }
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
     }

     return datos;
    }

}
