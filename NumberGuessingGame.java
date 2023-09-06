import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to The Number Guessing Game!!");
        System.out.println("Guess a Number in between 1 to 100 :");
        boolean guessed = false;
        while(!guessed){
            int guess = scan.nextInt();
            attempts++;

            if(guess == secretNumber){
                System.out.println("Congratulations! You guessed the correct number in" + attempts + " attempts.");
                guessed = true;
            }else if(guess < secretNumber){
                System.out.println("Too Low! Try Agian:");
            }else{
                System.out.println("Too High! Try Again:");
            }
        }
        scan.close();
    }
}
