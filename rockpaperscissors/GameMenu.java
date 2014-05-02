/**
 * GameMenu (extends Display) is a class that displays a the game menu
 * 
 * Methods:  displayGameMenu
 */
package rockpaperscissors;


public class GameMenu extends Display
{
    /**
     * Constructor for objects of class GameMenu
     */
    public GameMenu()
    {
    }

    /**
     * displayGetNumThrow is a method that displays a prompt to retrieve number of throws.
     * 
     */
    public void displayGetDifficultyLevel()
    {
        System.out.println("--------------------------------------\n~A New Match Begins \n What Difficulty?(smart/random or exit to stop playing)\n Please note that the first 5 throws of smart throw are random");
    }
    
    public void displayGetNumThrow()
    {
        System.out.println("\n~Please enter a number between 1 and 100 to "
            +"constitute the \n~number of throws in a match (Enter 0 to Exit):  ");

    }

    /**
     * displayNumThrowInputRangeError is a method that displays an error 
     * relating to the input received for the range of the size of the match 
     * 
     */
    public void displayNumThrowInputRangeError()
    {
        System.out.println("\nError: Number of throws entered is not within an appropriate"
            + "\nrange of rounds for a match.");
    }

    /**
     * displayNumThrowInputTypeError is a method that specifies what the input 
     * should be.
     * 
     * 
     */
    public void displayNumThrowInputTypeError()
    {
        System.out.println("\nError: Input needs to be an integer between 1 and 100.");
    }

    /**
     * displayNumThrowInputRequest is a method that prompts the user for a throw choice.
     * 
     */
    public void displayNumThrowInputRequest()
    {
        System.out.println(
            "~To request help in how to play this game, please enter 'help'."
            +"\n~Please enter your 'throw' choice for this round: \n");
    }
    
    
    
}