/*
 * Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
 * el programa debe ser capaz de almacenar en un arreglo N triángulos y 
 * rectángulos, y al final mostrar el área y los datos de cada uno.
*/

package Ejercicio_3_POO;

/**
 * @author Fernández
 */

public class Rectangulo extends Poligono{
   //Atributos
    private double lado1 = 0;
    private double lado2 = 0;

    public Rectangulo( double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
        
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectángulo: \n" + super.toString()+ "lado 1 : " + lado1 + " lado 2:" + lado2;
    }

    @Override
   public double area(){
       return lado1*lado2;
   }
    

    
    
}