import java.util.Scanner;

public class ShampooMethod {
    
      public static void printShampooInstructions(int numCycles) {
       
           
    // If numCycles is less than 1, print "Too few.
         if (numCycles < 1) {
            System.out.println("Too few.");
         } 
         
          //If more than 4, print "Too many."
         else if (numCycles > 4){
            System.out.println("Too many.");
         } 
         
	 // Print "N: Lather and rinse" numCycles times
         else {
            for (int i = 1; i <= numCycles; ++i) {
                System.out.println(i + ": Lather and rinse.");
            }
            // Add a newline after the last "Lather and rinse"
            System.out.println("Done.");
        }
    }
   
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userCycles;

      userCycles = scnr.nextInt();
      printShampooInstructions(userCycles);
   }
}