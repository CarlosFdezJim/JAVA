/*
 * Calcula la media de las notas introducidas por el usuario.
 */
package introduccion;

import java.util.Scanner;

/**
 *
 * @author Fernández
 * 
 */
public class Introduccion {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de números primitivos
        
        float media1;
        float media2;
        float media3;
        int cont = 0;
        int total;

        
        System.out.println("Introduce las tres notas de tu trimestre y calcularemos la nota media: ");
        media1 = entrada.nextFloat();
        cont++;
        media2 = entrada.nextFloat();
        cont++;
        media3 = entrada.nextFloat();
        cont++;
        
        //Convertimos el resultado de la operación en un tipo INT
        
        total = (int) ((media1+media2+media3)/cont);  
        
        //Mostramos por consola el resultado de la media.
        
        System.out.println("La media de los números introducidos es " +total);

        
        //Entrada de cadenas de texto
        
        String cadena;
        
        System.out.println("Por favor escriba la contraseña: ");
        cadena = entrada.nextLine();
        
        System.out.println("La contraseña es: " +cadena);
        
        
    
    }
    
}
