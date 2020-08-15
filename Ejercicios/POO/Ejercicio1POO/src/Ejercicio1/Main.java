/*
*  Ejercicio 1: Construir un programa que calcule el área y el perímetro de un 
*  cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud 
*  deberán introducirse por línea de ordenes. Si es un cuadrado, sólo se 
*  proporcionará la longitud de uno de los lados al constructor.
*/

package Ejercicio1;

import javax.swing.JOptionPane;

/**
 * @author Fernández
 */
public class Main {  
    public static void main(String[] args) {
        float lado1;
        float lado2;
        Cuadrilatero c1;
        
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Escriba el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Escriba el lado 2: "));
        
        //Si son iguales utiliza el constructor de cuadrado.
        if(lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
        }else{
            c1 = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
        
    }
    
}
