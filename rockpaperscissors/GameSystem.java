/**
 * Field Summary: Match m -- Match object responsible for playing a single
 * match.
 *
 * Constructor Summary: GameSystem() -- Default constructor to initialize member
 * fields. Method Summary: int run () -- Method that execute playing of a match.
 * Returns int to verify proper termination.
 */
package rockpaperscissors;

public class GameSystem {

    private static String difficulty;
    private static int numOfThrows;

    // For command line running of this program args have to be in the order:
    // String difficulty
    // int numThrows;
    public static void main(String[] args) {
        difficulty = ".";
        numOfThrows = -1;

        if (args.length == 2) {
            difficulty = args[0];
            numOfThrows = Integer.parseInt(args[1]);
        }

        Input in = new Input();
        run(in);
        System.out.println("Thank you for playing!");
    }

    private static void run(Input in) {
        MainMenu mainMenu = new MainMenu();
        GameMenu gameMenu = new GameMenu();
        boolean continuePlaying = true;

        // Display welcome message
        mainMenu.displayMainMenu();

        // Play RPS
        while (continuePlaying) {
            if (difficulty.compareTo(".") == 0) {


                // Prompt for difficulty level
                gameMenu.displayGetDifficultyLevel();

                // Get diff. level.
                difficulty = in.getDifficulty();
                if (difficulty.compareToIgnoreCase("exit") == 0) {
                    continuePlaying = false;
                    break;
                }
            }
            if (numOfThrows == -1) {


                // Prompt for number of throws in a match
                gameMenu.displayGetNumThrow();

                // Get number of throws in a match
                numOfThrows = in.getNumThrows();
                if (numOfThrows == 0) {
                    continuePlaying = false;
                    break;
                }
            }
            // Play a match
            if (numOfThrows > 0) {
                System.out.println("Number of Throws = " + numOfThrows);
                Match m = new Match(difficulty, numOfThrows);
                m.playMatch();
                numOfThrows = -1;
                difficulty = ".";
                //m.displayResults();
            } // User has decided to exit game
            else {
                continuePlaying = false;
            }
        }
    }
}