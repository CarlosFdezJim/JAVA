
package temperatura;

/**
 * @author Fernandez
 */

public class Temperatura {

    public static double celsiusToFarenheit(double c){
        //F = (1.8)C + 32
        return (1.8)*c+32;
    }
    public static double farenheitToCelsius(double f){
       //C = F-32/1.8
        return (f-32)/1.8;
    }
    
    public static void main(String[] args) {
        
        System.out.println("La temperatura Celsius en Farenheit es " + celsiusToFarenheit(35));
        System.out.println("La temperatura Farenheit en Celsius es: " + farenheitToCelsius(95));
    }
    
}
