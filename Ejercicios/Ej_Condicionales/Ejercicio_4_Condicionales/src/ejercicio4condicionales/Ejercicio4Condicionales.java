/*
 * En Nevada Shopping se hace un 20% de descuento a los clientes cuya 
 *  compra supere los 300€.
 * 
 */
package ejercicio4condicionales;

import javax.swing.JOptionPane;

/**
 * @author Fernández
 */
public class Ejercicio4Condicionales {


    public static void main(String[] args) {
        
    //Pedimos al usuario que indique la cantidad de dinero gastado en la compra.
    int gastado = 0, total = 0;
    float rebaja= 0.0f;
    
    gastado = Integer.parseInt(JOptionPane.showInputDialog("Introduce lo que te has gastado hasta ahora: "));
    
        if (gastado > 300) {
            rebaja = (float) ((float) gastado*0.20);
            total = (int) (gastado - rebaja);
            JOptionPane.showMessageDialog(null, "El descuento obtenido es " +rebaja+ "€, usted va a pagar un total de " +total+ "€");
            
        }else{
           JOptionPane.showMessageDialog(null, "El descuento obtenido a partir de 300€, lo sentimos usted no tiene descuento en esta compra. ");
           
        }
    }
    
}
