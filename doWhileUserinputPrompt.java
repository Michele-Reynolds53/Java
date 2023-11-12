import java.util.Scanner;

public class NumberPrompt {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;

    do {
	   // print enter a number <100
            System.out.println("Enter a number (<100): ");
            userInput = scnr.nextInt();
	
           /while user input is less than 100,print "Your number < 100 is + the userInput
        } while (userInput > 100);
        System.out.println("Your number < 100 is: " + userInput);

   