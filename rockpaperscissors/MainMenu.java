/**
 * This class is used to display the main menu
 * 
 * Methods: displayMainMenu
 * Displays the welcome screen to our game.
 * 
 */
package rockpaperscissors;
public class MainMenu extends Display
{

    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu()
    {
    }

    /**
     * This method prints out the main menu screen. Introducing our team name,
     * and our game.
     * 
     */
    public void displayMainMenu()
    {
        System.out.println(
                "\nWelcome to the Silver Snakes version of Rock Paper Scissors!");
    }
}