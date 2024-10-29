
package code;
import java.util.ArrayList;
import java.util.List;

public class Diseñador {
    private List<Diseño> portafolio;
    
    
    public Diseñador() {
        this.portafolio = new ArrayList<>();
    }

    public void crearDiseño(Diseño diseño) {
         portafolio.add(diseño);
    }
    public void subirDiseño() { }

    public List<Diseño> getPortafolio() {
        return portafolio;
    }

    public void setPortafolio(List<Diseño> portafolio) {
        this.portafolio = portafolio;
    }
}
