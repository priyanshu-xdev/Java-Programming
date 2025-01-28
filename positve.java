import java.util.*;

public class positve {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number:");
      int n = sc.nextInt();
      if (n >= 0) {
         System.out.println("Positive");
      } else {
         System.out.println("Negative");
      }
      sc.close();
   }
}
