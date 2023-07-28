import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Random random = new Random();
        int rolledDice = random.nextInt(6) + 1;
        System.out.println(rolledDice);

        Scanner scanner = new Scanner(System.in);
        int userGuess;

        System.out.println("Lets play the Roll Dice game");
        System.out.println("Try to guess the roll dice number");

        while(true){
            System.out.println("Guess a number between 1 and 6");
            userGuess = scanner.nextInt();

            if(userGuess < 1 || userGuess > 6){
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
            } else if (userGuess == rolledDice) {
                System.out.println("Congratulations, you guessed it correctly");
            } else {
                System.out.println("Try again");
            }
        }
    }
}
