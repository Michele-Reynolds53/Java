import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
                 
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
            
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
           
     
         
   // Ensure arrowhead width is greater than arrow base width
   while (arrowHeadWidth <= arrowBaseWidth) {
	   System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
   }
	
	System.out.println();
	
        // Draw arrow base
        for (int i = 0; i < arrowBaseHeight; i++) {
            for (int j = 0; j < arrowBaseWidth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Draw arrowhead
        for (int i = arrowHeadWidth; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
