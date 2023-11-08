import java.util.Scanner;

public class CheckingPasscodes {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean hasDigit;
      String passCode;

      hasDigit = false;
      passCode = scnr.next();

      /* Your solution goes here  */

      if (hasDigit) {
         System.out.println("Has a digit.");
      }
      else {
         System.out.println("Has no digit.");
      }
   }
}