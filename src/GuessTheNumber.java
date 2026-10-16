import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    void main(String[] args){
        Scanner randomizer = new Scanner(System.in);
        Random random = new Random();
        int attempts = 0;
        int maxAttempts = 7;
        boolean hasGuessedCorrectly = false;
        int number = random.nextInt(1 , 20);
        while (attempts < maxAttempts && !hasGuessedCorrectly) {
        System.out.print("Enter your guess: ");
        int num2 = randomizer.nextInt();
        attempts ++;
        if (num2 > number) {
            System.out.println("Too High!");
        }
        else if (num2 < number){
            System.out.println("Too Low!");
        }
        else {
            System.out.println("\nYou have guessed correctly");
            System.out.println("You needed " +attempts + " attempts");
            hasGuessedCorrectly = true;
        }
            System.out.println();

        }

        if (!hasGuessedCorrectly) {
            System.out.println("Game over!");
            System.out.println("The secret number was: " + number);
        }
        randomizer.close();




    }
}
