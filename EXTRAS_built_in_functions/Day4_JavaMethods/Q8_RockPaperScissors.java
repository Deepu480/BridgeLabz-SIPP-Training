package Day4_JavaMethods;

import java.util.Scanner;

public class Q8_RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    public static void displayStats(int rounds, int userWins, int computerWins, int draws) {
        System.out.println("\n=== Game Summary ===");
        System.out.println("Total Rounds: " + rounds);
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);

        double userPercent = (userWins * 100.0) / rounds;
        double computerPercent = (computerWins * 100.0) / rounds;

        System.out.printf("User Win Percentage: %.2f%%\n", userPercent);
        System.out.printf("Computer Win Percentage: %.2f%%\n", computerPercent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many games you want to play? ");
        int totalRounds = sc.nextInt();
        sc.nextLine(); 

        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 1; i <= totalRounds; i++) {
            System.out.println("\nRound " + i);
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();

            String computer = getComputerChoice();
            System.out.println("Computer chose: " + computer);

            String result = findWinner(user, computer);
            if (result.equals("User")) {
                System.out.println("You win this round!");
                userWins++;
            } else if (result.equals("Computer")) {
                System.out.println("Computer wins this round!");
                computerWins++;
            } else {
                System.out.println("It's a draw!");
                draws++;
            }
        }

        displayStats(totalRounds, userWins, computerWins, draws);
    }
}

