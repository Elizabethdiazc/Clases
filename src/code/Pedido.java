package code;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Pedido {
    private String pedidoId;
    private Cliente cliente;
    private double montoTotal;  
    private Date fechaPedido;
    private String estado;
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void quitarProducto(Producto producto) {
        productos.remove(producto);
       
    }
     
    public void calcularTotal() { }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    public void actualizarEstado() { }
    
    private final List<Producto> productos;
    public Pedido() {
        this.productos = new ArrayList<>();
    }
}

