import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);
        Scanner sc = new Scanner(System.in);

        while (true) {
            int guesses = 1;
            while (guesses < 6) {
                System.out.println("\nEnter a number: ");
                int guessedNumber = sc.nextInt();
                if (guessedNumber == number) {
                    System.out.println("You guessed the right number\nYou Won!");
                    System.out.println("Your scored " + (6 - guesses) * 200 + " points");
                    break;
                } else if (guessedNumber > number) {
                    System.out.println("The number you guessed is big.");
                    System.out.println("Guess a smaller number\n");
                    guesses++;
                } else {
                    System.out.println("The number you guessed is small.");
                    System.out.println("Guess a bigger number\n");
                    guesses++;
                }
            }

            if (guesses > 5) {
                System.out.println("Sorry, you lost!\nThe number was " + number);
            }

            System.out.println("Would you like to play again ? (y:1 /n:0) ");
            int answer = sc.nextInt();

            if (answer == 0)
                break;
                
        }

        sc.close();
    }
}