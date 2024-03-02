import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;
        

        while (playAgain) {
            
            int N= random.nextInt(100) + 1; 
            int attempts = 0;
            boolean correct = false;
            System.out.println("Welcome to the Number Game!");
            System.out.println("I've picked a number between 1 and 100. Try to guess it!");
            
            
            
            while (!correct && attempts < 10) { 
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++ ;

                if (guess == N) {
                    System.out.println("Congratulations! " + N + " is the correct number !");
                    correct = true ;
                    score++ ;
                } 
                
                else if (guess < N) {
                    System.out.println("Too low! Try again.");} 
                
                else {
                    System.out.println("Too high! Try again.") ;
                }
            }

            if (!correct) {
                System.out.println("Sorry, game over! You've used all your attempts. The number was: " + N) ;
            }

            System.out.println("Your score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }


}