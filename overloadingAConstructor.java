public class Restaurant {
   private String name;
   private int rating;

   // Default constructor
   public Restaurant() {
      name = "NoName";
      rating = -1;
   }

   // Another constructor
   public Restaurant(String initName, int initRating) {
      name = initName;
      rating = initRating;
   }

   // Prints name and rating on one line
   public void print() {                           
      System.out.println(name + " -- " + rating);
   }
}
