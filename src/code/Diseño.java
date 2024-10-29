
package code;
import java.util.ArrayList;
import java.util.List;

public class Diseño {
    private String diseñoId;
    private String titulo;
    private Diseñador diseñador;
    private String archivoDiseño;
    private final List<String> etiquetas;
    private final ArrayList<Producto> productos;
    private ArrayList<Object> archivoDiseños;
    
    public Diseño() {
        this.etiquetas = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public Diseño(String diseñoId, String titulo, Diseñador diseñador, String archivoDiseño, List<String> etiquetas, ArrayList<Producto> productos, ArrayList<Object> archivoDiseños) {
        this.diseñoId = diseñoId;
        this.titulo = titulo;
        this.diseñador = diseñador;
        this.archivoDiseño = archivoDiseño;
        this.etiquetas = etiquetas;
        this.productos = productos;
        this.archivoDiseños = archivoDiseños;
    }
    
    public void editarDiseño() { }

    public String getDiseñoId() {
        return diseñoId;
    }

    public void setDiseñoId(String diseñoId) {
        this.diseñoId = diseñoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Diseñador getDiseñador() {
        return diseñador;
    }

    public void setDiseñador(Diseñador diseñador) {
        this.diseñador = diseñador;
    }

    public String getArchivoDiseño() {
        return archivoDiseño;
    }

    public void setArchivoDiseño(String archivoDiseño) {
        this.archivoDiseño = archivoDiseño;
    }
    
    
    public void eliminarDiseño() { }
    
    
    
}
