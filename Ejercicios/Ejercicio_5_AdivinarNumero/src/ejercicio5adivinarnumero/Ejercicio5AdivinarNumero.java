/*
 * Ejercicio 5. Pedimos un número al usuario e intentaremos que el usuario lo adivine.
 */
package ejercicio5adivinarnumero;

import javax.swing.JOptionPane;

/**
 * @author Fernández
 */
public class Ejercicio5AdivinarNumero {

    public static void main(String[] args) {

        int numero, aleatorio, cont = 0;
        
        //Insertamos en una veriable de tipo entero el valor aleatorio.
        aleatorio = (int) (Math.random()*100);
        
        //Damos la bienvenida al usuario.
        JOptionPane.showMessageDialog(null, "Bienvenido usuario, intenta adivinar un número al azar.");
        
        do {        
            //Pedimos un número al usuario.
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número: "));
            
            //Dependiendo del número introducido, entrará en una parte diferente del If
            if(numero > aleatorio){
                JOptionPane.showMessageDialog(null, "Inserte un número menor.");
            }else if(numero < aleatorio){
                JOptionPane.showMessageDialog(null, "Inserte un número mayor.");
            }else{
                JOptionPane.showMessageDialog(null, "   ¡¡¡¡ENHORABUENA!!!!.    ");
            }
            cont++;
        } while (numero!=aleatorio);

        JOptionPane.showMessageDialog(null, "Adivinastes el número en "+cont+" intentos");



    }
    
}
