import java.util.Scanner;

public class CelsiusToFahrenheit {

   public static double celsiusToFahrenheit(double celcius) {
     return (9.0 / 5) * celcius + 32;
   }
  
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double tempF;
      double tempC;

      System.out.println("Enter temperature in Celsius: ");
      tempC = scnr.nextDouble();
      tempF = celsiusToFahrenheit(tempC);

      System.out.print("Fahrenheit: ");
      System.out.println(tempF);
   }
}
