import java.util.Scanner;
public class NumberGuessingGame {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int secretNumber = 15;
        int guess;

        do
        {
            System.out.print("Guess the secret number: ");
            guess = sc.nextInt();

            if(guess < secretNumber)
            {
                System.out.println("Secret number is greater than " + guess);
            }
            else if(guess > secretNumber)
            {
                System.out.println("Secret number is less than " + guess);
            }
            else
            {
                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while(guess != secretNumber);

        sc.close();
    }
    
}
