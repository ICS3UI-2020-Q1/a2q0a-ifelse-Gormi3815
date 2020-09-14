import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
     System.out.println("Please enter your age:");
    int age = input.nextInt();
    final int LICENSE_AGE = 16;
      final int VOTING_AGE = 18;


   if (age >= VOTING_AGE) {
      System.out.println("You are old enough to drive and vote!");
    } else if (age >= LICENSE_AGE) {
      System.out.println("You can get your driver's license!");
    } else {
      System.out.println("Sorry, you are not allowed to drive or vote.");
    }


  }
}
