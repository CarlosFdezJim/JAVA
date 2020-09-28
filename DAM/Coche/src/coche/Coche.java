
package coche;

/**
 * @author Fernandez
 */
public class Coche {
    
    private int velocidad = 0;
    

    public int getVelocidad() {
        return velocidad;
    }
    public void acelerar(int mas){
        velocidad+=mas;
    }
    public void frenar(int menos){
        velocidad-=menos;
    }
    
    public static void main(String[] args) {
        
        Coche car = new Coche();
        car.getVelocidad();
        System.out.println("La velocidad del coche es " + car.getVelocidad());
        car.acelerar(30);
        System.out.println("La velocidad del coche acelerando es " + car.getVelocidad());
        car.frenar(5);
        System.out.println("La velocidad del coche al frenar es " + car.getVelocidad());
        
    }
    
}
