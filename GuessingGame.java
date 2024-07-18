import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfAttempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + numberOfAttempts + " attempts.");
            }
        }

        scanner.close();
    }
}
