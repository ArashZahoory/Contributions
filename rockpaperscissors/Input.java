package rockpaperscissors;
import java.util.Scanner;
/**
 * Input is a class that retrieves user input for number of throws per round, 
 * throw per round, and the option for help.
 * 
 * Methods:  int getNumThrows(), char getThrow(), 
 */

public class Input
{

    /**
     * Constructor for objects of class Input
     */
    public Input()
    {
    }
    
    
    public String getDifficulty()
    {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    

    /**
     * getNumThrows is a method that collects the user input for the number of throws for a match.  
     * Then returns the number assuming it is valid.
     * 
     * @return     numThrows; which is the number of throws to constitute a match. 
     */
    public int getNumThrows()
    {
        Scanner in = new Scanner(System.in);
        int numThrows = 0;
        int temporary = 0;

        if(in.hasNextInt()){
            temporary = in.nextInt();

            if(temporary >= 0 && temporary <= 100){
                numThrows = temporary;
            }
            else{
                getNumThrows();
            }
        }
        else{
            getNumThrows();
        }

        return numThrows;
    }

    
    
    /**
     * getThrow is a method that takes the user input and seperates them into a choice ('r','p', and 's')
     * and 'help' and leads them into the correct place.
     * If the user input was none of the above then an error is thrown.
     * 
     * @return      char: 'r', char: 'p', or char: 's'.  
     *              r for rock, p for paper, and s for scissors.
     */
    public char getThrow()
    {
        Scanner in = new Scanner(System.in);
        String stringThrow = "h";
        char charThrow = 'n';

        if(in.hasNext("r") || in.hasNext("p") || in.hasNext("s")
        || in.hasNext("help"))
        {
            stringThrow = in.next();

            if(stringThrow.equals("r")){
                charThrow = 'r';
            }
            if(stringThrow.equals("p")){
                charThrow = 'p'; 
            }
            if(stringThrow.equals("s")){
                charThrow = 's'; 
            }
            if(stringThrow.equals("help")){
                Display display = new MainMenu();
                display.displayHelp();
                charThrow = getThrow();
            }      
        }
        else{
            System.out.println("Input not recognized. Please enter a valid command:");
            charThrow = getThrow(); 
        }
        return charThrow;
    }
    
    
}