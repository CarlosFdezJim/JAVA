/*
 * Ejercicio 3: Construir un programa que dada una serie de vehículos 
 * caracterizados por su marca, modelo y precio, imprima las propiedades 
 * del vehículo más barato. Para ello, se deberán leer por teclado las 
 * características de cada vehículo y crear una clase que represente a cada 
 * uno de ellos.
 */

package Ejercicio2;

import java.util.Scanner;

/*
 * @author Fernández
 */
public class Main {
    
    public static int cocheMasBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        
        precio = coches[0].getPrecio();
        for(int i=1;i<coches.length;i++){
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca;
        String modelo;
        float precio;
        int nVehiculos;
        int indiceBarato;
        
        //Preguntamos al usuario cuantos vehiculos desea.
        System.out.print("Indica el número de vahiculos: ");
        nVehiculos = entrada.nextInt();
        
        //Creamos tantos objetos coches como nos indique usuario.
        Vehiculo coches[] = new Vehiculo[nVehiculos];
        
        
        for(int i=0;i<coches.length;i++){
            
            entrada.nextLine();
            System.out.println("\nEscribe las características del coche "+(i+1)+":");
            System.out.print("Introduzca la marca del coche: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca el modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca el precio: ");
            precio = entrada.nextFloat();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceBarato = cocheMasBarato(coches);
        
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
    
}
