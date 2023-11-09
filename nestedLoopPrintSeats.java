import java.util.Scanner;
public class NestedLoops {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();
     
      
       //Loop through each row up to the number of rows
      for (currentRow = 1; currentRow <= numRows; currentRow++) {
         
         //Loop through each column up to the number of columns entered
         for (currentColumn = 1; currentColumn <= numColumns; currentColumn++) { 
            
            //add letters to seating based on the current column
            currentColumnLetter = (char) ('A' + currentColumn - 1);
            
            //Print seating 
            System.out.print(currentRow + String.valueOf(currentColumnLetter) + " ");
         }
      }
       
      System.out.println("");
   }
}