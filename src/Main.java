import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerScore = 0;
        int computerScore = 0;
        final String ROCK = "Rock";
        final String PAPER = "Paper";
        final String SCISSORS = "Scissors";

        while (true) {
            // Define the valid moves
            String[] moves = {ROCK, PAPER, SCISSORS};
            
            // Generate a random move for the computer
            int computerIndex = random.nextInt(moves.length);
            String computerMove = moves[computerIndex];

            // Get the user's move
            String playerMoveStr;
            String playerMove;

            do {
                System.out.print("Enter your move (R = Rock, P = Paper, S = Scissors): ");
                playerMoveStr = scanner.nextLine().toLowerCase();
                switch (playerMoveStr) {
                    case "r":
                        playerMove = ROCK;
                        break;
                    case "p":
                        playerMove = PAPER;
                        break;
                    case "s":
                        playerMove = SCISSORS;
                        break;
                    default:
                        playerMove = "";
                        break;
                }
            } while (playerMove.isEmpty());

            // Print the moves and determine the winner
            System.out.println("Computer's move: " + computerMove);
            if (computerMove.equals(playerMove)) {
                System.out.println("TIED");
            } else if (computerMove.equals(ROCK) && playerMove.equals(SCISSORS)) {
                System.out.println("Computer Wins!");
                computerScore++;
            } else if (computerMove.equals(ROCK) && playerMove.equals(PAPER)) {
                System.out.println("Player Wins!");
                playerScore++;
            } else if (computerMove.equals(PAPER) && playerMove.equals(ROCK)) {
                System.out.println("Computer Wins!");
                computerScore++;
            } else if (computerMove.equals(PAPER) && playerMove.equals(SCISSORS)) {
                System.out.println("Player Wins!");
                playerScore++;
            } else if (computerMove.equals(SCISSORS) && playerMove.equals(PAPER)) {
                System.out.println("Computer Wins!");
                computerScore++;
            } else if (computerMove.equals(SCISSORS) && playerMove.equals(ROCK)) {
                System.out.println("Player Wins!");
                playerScore++;
            }

            // Print the scores
            System.out.println("Player Score: " + playerScore);
            System.out.println("Computer Score: " + computerScore);
        }
    }
}
