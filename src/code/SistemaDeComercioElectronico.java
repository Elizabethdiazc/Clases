package code;

import java.util.ArrayList;

  public class SistemaDeComercioElectronico {
    private final ArrayList<Pedido> pedidos;
      
      public SistemaDeComercioElectronico() {
        this.pedidos = new ArrayList<>();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void procesarPago() { }
    public void gestionarInventario() { }
    public void generarFactura() { }
}
