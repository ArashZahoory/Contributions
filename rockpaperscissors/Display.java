
package rockpaperscissors;
/**
 * Abstract class Display - Any class that extends this 
 * abstract class:  communicates information to the user, 
 * and utilizes an Input object to retrieve the information 
 * that it asks from the user.  Also this abstract class 
 * contains a method to display help to the screen when 
 * requested by the user, which it inherits to its sublcasses.  
 * 
 * 
 * Methods:  displayHelp
 */
public abstract class Display
{
    /**
     * This method displays information for the user on how to play the game.  
     * 
     */
    
    
    public void displayHelp()
    {
        System.out.println(
                "\nWelcome to Rock-Paper-Scissors! The goal of this game\n"
                +"is to choose an item(rock, paper, or scissors) that beats\n" 
                +"your opponent.\n"
                +"\nRock beats(breaks) Scissors\n"
                +"Scissors beats(cuts) Paper\n"
                +"Paper beats(covers) Rock\n"
                +"\nTo play this game, you choose your item by entering\n"
                +"'r' for Rock\n"
                +"'p' for Paper\n"
                +"'s' for Scissors\n"
                +"Good luck, and have fun!\n"
                +"\n Please enter your throw now!"
                );
    }
}