import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("Type rock, paper, or scissors (or 'exit' to quit)");

        while (true) {
            System.out.print("\nYour move: ");
            String userChoice = sc.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Check if input is valid
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            // Generate random computer move
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Determine winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win! 🎉");
            } else {
                System.out.println("You lose! 😢");
            }
        }

        sc.close();
    }
}
