package rockpaperscissors;
import java.util.ArrayList;


public class Match {
    
   /** ResultsHistory history stores history of match
    * int roundsPerMatch stores the number of rounds chosen
    */ 
    public static ResultsHistory history = new ResultsHistory();
    private String difficulty;
    private int roundsPerMatch;

    
    
    public Match(String inDifficulty, int rounds){
        difficulty = inDifficulty;
        roundsPerMatch = rounds;
        System.out.println("Rounds per match = " + roundsPerMatch);
    }
    
        
    /**
     *  void playMatch
     *  plays a match with number of rounds chosen and stores each 
     *  rounds results in the history.
     *  Then it calls displayResult to display the result from the most recent match.
     */
    public void playMatch(){
        for(int i = 0; i < roundsPerMatch; i++){
            Round rnd = new Round(difficulty);
            Result r = rnd.playRound();
            history.addResult(r);
            display1Result(r);

        }
    }
    /**
     *  void displayResult
     *  Displays the user and computers choices found in the history
     *  Displays who won the round in the history
     *  Displays the total score player-tie-computer
     */ 
    public void display1Result(Result result){
        
        Result r = result;
        
        int ties = history.getNumTies();
        int comp = history.getNumComputerWins();
        int player = history.getNumPlayerWins();
        
        
        
        
        String playerGesture = r.getPlayerGesture();
        String compGesture = r.getCompGesture();
        String winnerText = "";
        
        if(r.getWinner().equals("player")){
            winnerText = "The winner of the round is the Player ";
        } else if(r.getWinner().equals("comp")){
            winnerText = "The winner of the round is the Computer ";
        } else if(r.getWinner().equals("tie")){
            winnerText = "This round ended in a Tie ";
        }
        
        
        System.out.println("Player Gesture: " + playerGesture);
        System.out.println("Computer Gesture: " + compGesture);
        System.out.println("\n" + winnerText + "\nScore = player-ties-computer " + player + "-" + ties + "-" + comp + "\n");
        
       }

}