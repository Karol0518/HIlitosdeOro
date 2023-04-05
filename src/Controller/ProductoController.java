/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Producto;
import Model.ProductoDAO;
import java.util.List;

/**
 *
 * @author KROMERO
 */
public class ProductoController {

    public ProductoController() {
    }
    
        public int registrar(Producto producto){
           ProductoDAO dao = new ProductoDAO();
            return dao.agregar(producto);
           }
    
        public List listar(){
            ProductoDAO dao = new ProductoDAO();
            return dao.listar();
        }
    

}
