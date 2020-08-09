/*
 * Crea una simulación de un cajero automático con un saldo inicial de 1000€.
 
 * Ver Saldo
 * Sacar Dinero
 * Ingresar Dinero.
 * Salir.
 */
package ejercicio13cajeroautomatico;

import javax.swing.JOptionPane;

/**
 * @author Fernández
 */
public class Ejercicio13CajeroAutomatico {


    public static void main(String[] args) {
        //Declaración de variables.
        final int saldoinicial = 1000;
        int opcion = 0, saldoactual = 0, retirar = 0, ingresar = 0;
       
       saldoactual=saldoinicial;
        
        while (opcion!=4) {            
             opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Cajero automático\n "
                + "1. Ver saldo actual\n "
                + "2. Sacar dinero\n "
                + "3. Ingresar dinero\n "
                + "4. Salir\n "));
       
            switch(opcion){
                case 1:
                        JOptionPane.showMessageDialog(null,"\nSu saldo actual es: "+saldoactual+" €");
                    break;
                case 2:
                    retirar = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad a retirar."));
                    if (saldoactual >= retirar ){
                        saldoactual -= retirar;
                        JOptionPane.showMessageDialog(null,"\nSu saldo actual es: "+saldoactual+" €");
                    }else{
                        JOptionPane.showMessageDialog(null,"\nLo sentimos, no podemos realizar esta operación"
                                + "porque la cantidad es superior a la que usted dispone.\n"
                                + "Saldo disponible: "+saldoactual);
                    }
                    break;   
                case 3:
                    ingresar = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad a ingresar."));
                    saldoactual+=ingresar;
                    JOptionPane.showMessageDialog(null,"\nSu saldo actual es: "+saldoactual+" €");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,"\nSaliendo, muchas gracias por utilizar nuestro cajero.");
                    break;
            }
        }
     }    
  
        
        
        
        
        
        
        
        
        
    }
