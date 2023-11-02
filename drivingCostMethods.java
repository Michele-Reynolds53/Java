import java.util.Scanner;

public class LabProgram {
   
     public double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
         double totalCost = (milesDriven / milesPerGallon) * dollarsPerGallon;
	      return totalCost;
     }
   
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
         double milesPerGallon;
         double dollarsPerGallon;
     
         milesPerGallon = scnr.nextDouble();
         dollarsPerGallon = scnr.nextDouble();
   
     
         LabProgram labProgram = new LabProgram(); 
         System.out.printf("%.2f ", labProgram.drivingCost(milesPerGallon, dollarsPerGallon, 10.0));
         System.out.printf("%.2f ", labProgram.drivingCost(milesPerGallon, dollarsPerGallon, 50.0));
         System.out.printf("%.2f%n", labProgram.drivingCost(milesPerGallon, dollarsPerGallon, 400.0));

        }
}