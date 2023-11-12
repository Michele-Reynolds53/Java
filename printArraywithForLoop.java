import java.util.Scanner;

public class CourseGradePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;

      for (i = 0; i < courseGrades.length; ++i) {
         courseGrades[i] = scnr.nextInt();
      }
      
      //print grades in original order   
      for (i = 0; i< courseGrades.length; ++i) {
         System.out.print(courseGrades[i] + " ");
      }
      System.out.println();
       
      //print grades in reverse order
      Scanner scnr2 = new Scanner(System.in);   
      for (i = courseGrades.length - 1; i >= 0; --i) {
         System.out.print(courseGrades[i] + " ");
      }
      System.out.println();
           
   }
}