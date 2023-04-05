package Model;

/**
 *
 * @author KROMERO
 */
public class Producto {
    
    private int IdProducto;
    private String NomProducto;
    private Double VlrUnidad;

    public Producto(int IdProducto,String NomProducto, Double VlrUnidad) {
        this.IdProducto = IdProducto;
        this.NomProducto = NomProducto;
        this.VlrUnidad = VlrUnidad;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNomProducto() {
        return NomProducto;
    }

    public void setNomProducto(String NomProducto) {
        this.NomProducto = NomProducto;
    }

    public Double getVlrUnidad() {
        return VlrUnidad;
    }

    public void setVlrUnidad(Double VlrUnidad) {
        this.VlrUnidad = VlrUnidad;
    }
    
}
