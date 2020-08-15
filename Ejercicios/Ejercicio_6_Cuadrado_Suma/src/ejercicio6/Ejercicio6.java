/*
 * Ejercicio 6:
 * Hacer un programa que calcule el cuadrado de una suma
 * (a+b)2 = a2 + b2 + 2a.
*/
package ejercicio6;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 * @author Fernández
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int suma1, suma2, total;
        
        System.out.println("Buenas usuario, te vamos a pedir dos números y calcularemos el cuadrado de la suma. ");
        
        //Pedimos los valores al usuario.
        System.out.println("Intorduce un valor de la suma: ");
        suma1 = entrada.nextInt();
        
        System.out.println("Intorduce el otro número de la suma: ");
        suma2 = entrada.nextInt();
        
        //Calculamos el total de la suma.
        total = suma1 + suma2;
        
        //Imprimos por consola el número total de la suma.
        System.out.println("El resultado de la suma es: "+total);
        
        //Calculamos la suma al cuadrado y lo devolvemos por consola.
        System.out.println("El resultado de la suma al cuadrado es: "+pow(total, 2));
        
    }
    
}
