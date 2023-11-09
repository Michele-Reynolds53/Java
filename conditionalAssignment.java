import java.util.Scanner;

public class UpdateNumberOfUsers {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numUsers;
      int updateDirection;

      numUsers = scnr.nextInt();
      updateDirection = scnr.nextInt();

      if (updateDirection >= 1) {
         numUsers += 1;
      }
      else {
         numUsers -= 1;
      }
         

      System.out.println("New value is: " + numUsers);
   }
}