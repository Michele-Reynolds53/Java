import java.util.Scanner;

public class PopcornTimer {
   public static void printPopcornTime(int bagOunces) {

// If bagOunces is less than 2, print "Too small".
   if(bagOunces < 2) {
   	System.out.println("Too small");
}
    else if(bagOunces > 10) {
        //If greater than 10, print "Too large"
	 System.out.println("Too large");
}

    else {
	//Otherwise, compute and print 6 * bagOunces followed by " seconds".
	 System.out.println((6 * bagOunces) +  " seconds");
}

   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userOunces;

      userOunces = scnr.nextInt();
      printPopcornTime(userOunces);
   }
}