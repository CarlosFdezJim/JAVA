
package CristoBook;

/**
 * @author Fernández
 */
public class Foto {
    private String ruta;
    private String tipo;
    private int tamanio;
    
    public Foto(){
        System.out.println("********  CREANDO FOTO  **********");
        this.ruta = "";
        this.tipo = "";
        this.tamanio = 0;
        System.out.println("La foto se ha creado correctamente.");
    }

    public Foto(String ruta, String tipo, int tamanio) {
        this.ruta = ruta;
        this.tipo = tipo;
        this.tamanio = tamanio;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public String getRuta() {
        return ruta;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamanio() {
        return tamanio;
    }
    
    public void printFoto(){
        System.out.println("Foto ");
    }

    
}
