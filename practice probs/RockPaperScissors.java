import java.util.*;

public class RockPaperScissors {

    // Method to decide the winner
    public static String playRound(String playerMove, String computerMove) {

        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int rounds = 5;
        int wins = 0, losses = 0, draws = 0;

        String[][] summary = new String[rounds][4];

        for (int i = 0; i < rounds; i++) {

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String playerMove = sc.next();

            String computerMove = moves[random.nextInt(3)];

            String result = playRound(playerMove, computerMove);

            if (result.equals("Player Wins"))
                wins++;
            else if (result.equals("Computer Wins"))
                losses++;
            else
                draws++;

            summary[i][0] = String.valueOf(i + 1);
            summary[i][1] = playerMove;
            summary[i][2] = computerMove;
            summary[i][3] = result;

            System.out.println("Computer Move: " + computerMove);
            System.out.println("Result: " + result);
            System.out.println();
        }

        System.out.println("\nFinal Summary");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-8s %-15s %-15s %-15s%n",
                "Round", "Player Move", "Computer Move", "Result");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < rounds; i++) {
            System.out.printf("%-8s %-15s %-15s %-15s%n",
                    summary[i][0], summary[i][1], summary[i][2], summary[i][3]);
        }

        double winPercentage = (wins * 100.0) / rounds;

        System.out.println("\nWins   : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Draws  : " + draws);
        System.out.printf("Win Percentage: %.1f%%\n", winPercentage);

        sc.close();
    }
}
