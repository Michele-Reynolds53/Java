import java.util.Scanner;
import java.io.IOException;

public class ParseStrings {
   
   //Input/output exception error
   public static void main(String[] args) throws IOException {
      
      //variable userInput type assigned is String
      String userInput;
      
      // create new scanner class
      Scanner scnr = new Scanner(System.in);
            
      //while output reads Enter input string, get user input
      while (true) {
         System.out.println("Enter input string: ");
         userInput = scnr.nextLine();
         
                         
         //while user input contains a comma 
         while (!userInput.contains(",") && !userInput.equals("q")) {
            
           // print Error: no comma in string
            System.out.println("Error: No comma in string");
               
            //if userInput is not 'q' print Enter input string
            System.out.println("Enter input string: ");
            userInput = scnr.nextLine();
         }
            
         // if user input is "q" then quit
         if (userInput.equals("q")){
            break;
         }
            
         //Split user input array at the comma
         String[] userInputArray = userInput.split(",");
            
         //Print first word in the array before the comma
         System.out.println("First word: " + userInputArray[0].trim());
            
         //Print the second word in the array after the comma
         System.out.println("Second word: " + userInputArray[1].trim());
         
         //Print two blank lines
         System.out.println();
         System.out.println();
         }
      }
   }         
            
            
            
               
            
            
            
      
               
         
         
      

