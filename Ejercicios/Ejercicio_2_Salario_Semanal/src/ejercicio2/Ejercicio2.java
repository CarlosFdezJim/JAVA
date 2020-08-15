/*
 * Ejercicio 2:
 * Calcula e imprime el salario semanal de un empleado a partir de
 * sus horas semanales trabajadas y su salario por hora.
 */
package ejercicio2;

import java.util.Scanner;

/**
 * @author Fernández
 */
public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int horas = 0;
        float salario = 0.0f;
        int total;
        
        //Pedimos los datos al usuario.
        
        System.out.println("Buenas Carlos, introduce las horas semanales que trabajas: ");
        horas = entrada.nextInt();
        
        System.out.println("Introduce el salario por hora que cobra usted: ");
        salario = entrada.nextFloat();
        
        //Calculamos el salario mensuak.¡¡l.
        total = (int) (salario*horas);
        
        //Devolvemos por pantalla el resultado.
        System.out.println("Tu salario mensual sería: "+total);
        
        
    
    
    }
    
}
