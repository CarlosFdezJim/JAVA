/*
 * Ejercicio 3: Programa que lea un carácter por teclado y compruebe si es una 
 *  letra mayúscula. 
 */
package ejercicio3condicionales;

import javax.swing.JOptionPane;

/**
 * @author Fernández
 */
public class Ejercicio3Condicionales {

   
    public static void main(String[] args) {

        char letra;
        
        letra = JOptionPane.showInputDialog("Introduzca una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
             JOptionPane.showMessageDialog(null, "La letra introducida "
                     + "es una letra MAYÚSCULA. ");
        }else{
             JOptionPane.showMessageDialog(null, "La letra introducida "
                     + "es una letra minúscula. ");

        }
    }
    
}
