package code;
import java.util.List;

public class Producto {
    private String productoID;
    private String nombre;
    private String description;
    private double precio;
    private int stock;
    private String categoria;
    private Diseño diseño;
    
    
    public Producto() {
       
    }

    public Producto(String productoID, String nombre, String description, double precio, int stock, String categoria, Diseño diseño) {
        this.productoID = productoID;
        this.nombre = nombre;
        this.description = description;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.diseño = diseño;
    }

    public void actualizarStock() { }

    public String getProductoID() {
        return productoID;
    }

    public void setProductoID(String productoID) {
        this.productoID = productoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Diseño getDiseño() {
        return diseño;
    }

    public void setDiseño(Diseño diseño) {
        this.diseño = diseño;
    }
    
    public void aplicarDescuento() { }
    public void agregarResena() { }
}