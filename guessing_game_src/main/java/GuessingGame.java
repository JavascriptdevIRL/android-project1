import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
      //print administrator setup
      
      
      Scanner scanner = new Scanner(System.in);
      System.out.printf("What do you want to fill the jar with?");
      String itemName = scanner.nextLine();
      
      System.out.printf("What is the max number of %s? ",itemName);
      int MAX_ITEMS =scanner.nextInt();
      
      Jar jar = new Jar (itemName, MAX_ITEMS);
      
      int itemsInJar = jar.fillJar();
      int numberOfTries = 1;
     
      
      
      System.out.printf("How many %s are in the jar? Guess a number between 1 and %d: %n",
                        jar.itemName,
                        jar.MAX_ITEMS);
      
      
      int Guess = scanner.nextInt();
      
      while (Guess!= itemsInJar){
        
        System.out.printf("Your guess was wrong. Please try again: ");
        Guess = scanner.nextInt();
        numberOfTries ++;
        
        
      }
      
      
      System.out.printf("Well done! You got it in %d attempts! %n", numberOfTries);
      
    }
}
