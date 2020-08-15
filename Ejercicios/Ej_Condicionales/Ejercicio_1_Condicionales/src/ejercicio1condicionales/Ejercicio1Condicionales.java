/**
* Ejercicio 1: Programa que lea un número entero y muestre si el número es 
* múltiplo de 10.
*/

package ejercicio1condicionales;

import javax.swing.JOptionPane;

/**
 * @author Fernández
 */
public class Ejercicio1Condicionales {


    public static void main(String[] args) {
        
       int numero;
       
       //Pedimos al usuario una entrada de número.
       numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número y te diré si es múltiplo de 10: "));
       
       //Si es multiplo de 10 el resto será 0.
       if(numero%10 == 0 ){
           JOptionPane.showMessageDialog(null, "El número introducido " +numero+" SI es múltiplo de 10.");
       }else{
           JOptionPane.showMessageDialog( null, "El número " +numero+ " NO es múltiplo de 10.");
       }
    }
    
}
