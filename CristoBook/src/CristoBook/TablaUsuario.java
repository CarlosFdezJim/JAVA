
package CristoBook;

/**
 * @author Fernández
 */

public final class TablaUsuario {
    Usuario[] bdUsuario = new Usuario[10];
    private int totalTuplas;
    
    public TablaUsuario(){
        System.out.println("********  CREANDO TABLAUSUARIO  **********");
        this.totalTuplas = 10;
        bdUsuario();
        System.out.println("la TablaUsuarios se ha creado correctamente con " +getTotalTuplas() +" tuplas");
         
    }
    
    public void printbdUsuario(){
        for(int i=0; i < this.getTotalTuplas();i++){
            bdUsuario[i].printUsuario();
        }
    }
    
    public void TablaUsuario(int totalTuplas) {
        System.out.println("********  CREANDO TABLAUSUARIO  **********");
        this.totalTuplas = totalTuplas;
        System.out.println("la TablaUsuarios se ha creado correctamente.");
    }

    public void setTotalTuplas(int totalTuplas) {
        this.totalTuplas = totalTuplas;
    }

    public int getTotalTuplas() {
        return totalTuplas;
    }
    
    public void bdUsuario(){
        
        Usuario Carlos = new Usuario("CarlosCristoRey","Carlos","Fernández","Admin");
        bdUsuario[0] = Carlos;
        Usuario Cristian = new Usuario("CristianCristoRey","Cristian","Campos","Admin");
        bdUsuario[1] = Cristian;
        Usuario Jaime = new Usuario("JaimeCristorey","Jaime","Cabeza","Admin");
        bdUsuario[2] = Jaime;
        Usuario David = new Usuario("DavidCristoRey","David","Lopez","Admin");
        bdUsuario[3] = David;
        Usuario Pablo = new Usuario("PabloCristoRey","Pablo","García","Admin");
        bdUsuario[4] = Pablo;
        
        
        //printbdUsuario();
        
        
    }

}
