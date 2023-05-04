import java.util.Random;
import java.util.Scanner;
public class Number_Guessing_Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int numGuesses = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            System.out.println("Guess a number between 1 and 100:");
            int guess = scanner.nextInt();
            numGuesses++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the secret number in " + numGuesses + " guesses!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Guess again.");
            } else {
                System.out.println("Too high! Guess again.");
            }
        }
    }
}
