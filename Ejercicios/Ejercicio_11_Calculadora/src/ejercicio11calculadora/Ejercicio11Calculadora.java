/*
 * Ejercicio 11: Diseña una calculadora simple.
 */
package ejercicio11calculadora;

import javax.swing.JOptionPane;

/**
 * @author Fernández
 */
public class Ejercicio11Calculadora {


    public static void main(String[] args) {
        //Declaración de variables.
        int num1, num2, total;
        char opcion;

        //
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número: "));
        
        opcion =  JOptionPane.showInputDialog("Introduce la opción que deseas: \n"
                + "[S/s] Sumar\n "
                + "[R/r] Restar\n "
                + "[M/m] Multiplicar\n "
                + "[D/d] Dividir\n ").charAt(0);
       
        //Pedimos al usuario que introduzca un número.
        switch(opcion){
            case 'S':
            case 's' :
                     total = num1+num2;
                     JOptionPane.showMessageDialog(null, "El resultado es: "+total);
                     break;
            case 'R':
            case 'r' :
                     total = num1-num2;
                     JOptionPane.showMessageDialog(null, "El resultado es: "+total);
                     break;
            case 'M':
            case 'm' :
                     total = num1*num2;
                     JOptionPane.showMessageDialog(null, "El resultado es: "+total);
                     break;
            case 'D':
            case 'd' :
                     total = num1/num2;
                     JOptionPane.showMessageDialog(null, "El resultado es: "+total);
                     break;
            default:
                     JOptionPane.showMessageDialog(null, "La opción indicada no es la correcta");
        }
        
    }
    
}
