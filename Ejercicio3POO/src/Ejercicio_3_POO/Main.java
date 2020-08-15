/*
 * Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
 * el programa debe ser capaz de almacenar en un arreglo N triángulos y 
 * rectángulos, y al final mostrar el área y los datos de cada uno.
*/

package Ejercicio_3_POO;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Fernández
 */

public class Main {
    static ArrayList<Poligono> mipoligono  = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        //Pedimos al usuario que polígono desea llenar.
        llenarPoligono();
        
        //Mostramos los datos y el area de cada poligono.
        mostrarResultado();
    }
    
    public static void llenarPoligono(){
        char respuesta = 0;
        int opcion;
        
        do{
            do {            
                System.out.println("Escriba que polígono desea rellenar: ");
                System.out.println("1. Triángulo");
                System.out.println("2. Rectángulo");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();

            } while(opcion <1 || opcion >2);
            
            switch (opcion) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
                    
            }
            
            System.out.println("\n¿Desea introducir otro polígono?(s/n)");
            respuesta = entrada.next().charAt(0);
            System.out.println("\n");
            
        } while(respuesta == 'S' || respuesta == 's');
        
    }
    
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        
        System.out.print("\nEscriba el lado 1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Escriba el lado 2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Escriba el lado 3 del triángulo: ");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        //Guardamos el triangulo en nuestro vector polimorfico.
        mipoligono.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double lado1,lado2;
        
        System.out.print("\nEscriba el lado 1 del rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Escriba el lado 2 del rectángulo: ");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        //Guardamos el rectangulo en nuestro vector polimorfico.
        mipoligono.add(rectangulo);
    }
    
    public static void mostrarResultado(){
        for(Poligono poli: mipoligono){
            System.out.println(poli.toString());
            System.out.println("Área: "+poli.area());
            System.out.println("");
        }
    }
    
}
