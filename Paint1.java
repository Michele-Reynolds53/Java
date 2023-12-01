import java.util.Scanner;
import java.util.InputMismatchException;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        do {
        	try{    	
        	// Prompt user to input wall's height
        		System.out.println("Enter wall height (feet): ");
        		wallHeight = scnr.nextDouble();
        	}
        	//catching when user input does not enter a valid number 
         	catch (InputMismatchException e) {
        		System.out.println("You entered an invalid number.");
        		scnr.next();
        	 }
        	//continue looping until user enters a valid number for wallHeight
        } while (wallHeight <= 0);            
        
        
        // Implement a do-while loop to ensure input is valid
        do {
            try {
        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();
        	}
          //catching when user input does not enter a valid number  for wallWidth
            catch (InputMismatchException e){
        		System.out.println("You entered an invalid nuber.");
                scnr.next();
            }
        // continue looping until user enters a valid number
        } while (wallWidth <= 0);       	
        	   
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        

    }
}
