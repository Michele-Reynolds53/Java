import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);  
     //declare variables
     int i;
     double maxVal;
     double sum = 0;
     double [] PeopleWeights = new double[5];

     //Prompt user for input  
     for (i = 0; i < PeopleWeights.length; ++i) {
         PeopleWeights[i] = scnr.nextDouble();
      }

     //Print numbered list of weights
     for (i = 0; i  < PeopleWeights.length; i++) {
    	System.out.println("Enter weight " + (i + 1) + ": ");
    }
    System.out.println();
    
    //Print weights all on one line
    System.out.print("You entered: ");
        for (i = 0; i < PeopleWeights.length; i++) {
            System.out.print(PeopleWeights[i]);
            System.out.print(" ");
        }
    System.out.println();    
   
	//Print sum total of weights
   	 for (i = 0; i < PeopleWeights.length; i++) {
		sum += PeopleWeights[i];
	 }
		 System.out.println("Total weight: " + sum);
	

  	 double average = sum / PeopleWeights.length;
         System.out.println("Average weight: " + average);
         
    	// Determine largest (max) number
      	  maxVal = PeopleWeights[0];           
      
          for (i = 0; i < PeopleWeights.length; ++i) {
              if (PeopleWeights[i] > maxVal) {
                  maxVal = PeopleWeights[i];
         }
      }
      System.out.println("Max weight: " + maxVal);
   }
}


