/*
 * Pedimos datos al usuario, y los mostramos en una ventana flotante.
 */
package introduccion2;

import javax.swing.JOptionPane;

/**
 * @author Fernández
 */
public class Introduccion2 {

    public static void main(String[] args) {

        String cadena;
        int entero;
        double decimal;
        char letra;
        
        //Pedimos los datos al usuario.
        
        cadena = JOptionPane.showInputDialog("Por favor introduzca una cadena de caracteres: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
        letra = JOptionPane.showInputDialog("Introduzca una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un decimal: "));
        
        //Mostramos los  datos por pantalla.
        
        JOptionPane.showMessageDialog(null, "La frase introducida es: "+cadena);
        JOptionPane.showMessageDialog(null, "El entero introducido es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra introducida es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal intrpducida es: "+decimal);





    }
    
}
