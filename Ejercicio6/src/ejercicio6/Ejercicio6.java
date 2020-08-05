/*
 * Ejercicio 6:
 * Hacer un programa que calcule el cuadrado de una suma
 * (a+b)2 = a2 + b2 + 2ab
 *
*/
package ejercicio6;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Fernández
 * 
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int suma1, suma2, total;
                
        System.out.println("Buenas usuario, te vamos a pedir dos números y calcularemos el cuadrado de la suma. ");
        
        System.out.println("Intorduce un valor de la suma: ");
        suma1 = entrada.nextInt();
        
        System.out.println("Intorduce el otro número de la suma: ");
        suma2 = entrada.nextInt();
        
        total = suma1 + suma2;
        System.out.println("El resultado de la suma es: "+total);
        System.out.println("El resultado de la suma al cuadrado es: "+pow(total, 2));
        
    }
    
}
