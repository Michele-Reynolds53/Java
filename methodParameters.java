public class Player {
   public static void printPoints(String name, int age, int totalPoints) {
      System.out.println(name + " is " + age);
      System.out.println(name + " made " + totalPoints + " points");
   }

   public static void main (String [] args) {
      String userName = "Joe";
      int userAge = 20;
      int regularTimePoints = 23;
      int overtimePoints = 4;

      printPoints(userName, userAge, regularTimePoints + overtimePoints);
   }