
package Herencia;

/*
 * @author Fernández
 */

//Usamos extends para indicarle que hereda de la clase Persona.
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;
    
    //Constructor de clase Hija.
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        
        //Le indicamos que nombre,apellido y edad ya están inicializados y que los hereda.
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
        
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCódigo Estudiante: "+codigoEstudiante+
                "\nNota Final" +notaFinal);
    }
    
    
}
