/*
 * Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
 * el programa debe ser capaz de almacenar en un arreglo N triángulos y 
 * rectángulos, y al final mostrar el área y los datos de cada uno.
*/

package Ejercicio_3_POO;

/**
 * @author Fernández
 */

public abstract class Poligono {
     //Atributos
    protected int numeroLados = 0;

    //Constructor clase Padre
    public Poligono(int numeroLados){
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }
    

    @Override
    public String toString() {
        return "Numero Lados= " + numeroLados+"\n";
    }
    
    //Método Abstacto.
    public abstract double area();
    
    
    
    
    
    
}
