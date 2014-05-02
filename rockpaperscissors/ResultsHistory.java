package rockpaperscissors;

import java.util.ArrayList;

/**
 *
 *              getNumComputersWin
 *                  returns the number of player wins. 
 * 
 *              getNumTies
 *                  returns the number of player wins.
 * 
 *		void getResults
 *		 returns Array List with result objects.
 *
 */
public class ResultsHistory {

    /**
     * Field Summary:
     *		    ArrayList<Result> results --
     *			Dynamic data structure used to store the results of each round.
     *              private int numPlayerWins --
     *                      Keeps track of the number of wins by the player
     *              private int numComputerWins --
     *                      Keeps track of the number of wins by the computer
     *              private int numTies --
     *                      Keeps track of the number of ties
     */
    private ArrayList<Result> rHistory;
    private int numPlayerWins = 0;
    private int numComputerWins = 0;
    private int numTies = 0;

    /**
     * Constructor Summary -
     *      Creates the ArrayList of results.
     */
    public ResultsHistory() {
        rHistory = new ArrayList<Result>();
    }

    /**
     *  Method Summary:
     *      void addResult () --
     *		Adds a Result object to the ResultsHistory.  This is done
     *		after each round.
     *              It also adds 1 to the number of wins for either the player, computer,
     *              or ties after determining who won.
     * @param r
     *      r is the result that needs to get added.
     */
    public void addResult(Result r) {
        rHistory.add(r);


        if (r.getWinner().equals("player")) {
            numPlayerWins++;
        } else if (r.getWinner().equals("comp")) {
            numComputerWins++;
        } else {
            numTies++;
        }
    }

    /**
     *  getNumPlayerWins
     *         returns the number of player wins.
     * @return
     *     returns numPlayerWins, the number of player wins.
     */
    public int getNumPlayerWins() {
        return numPlayerWins;
    }

    /**
     *  getNumComputerWins
     *         returns the number of computer wins.
     * @return
     *     returns numComputerWins, the number of computer wins.
     */
    public int getNumComputerWins() {
        return numComputerWins;
    }

    /**
     *  getNumTies
     *         returns the number of ties
     * @return
     *     returns numTies, number of ties.
     */
    public int getNumTies() {
        return numTies;
    }

    /**
     *  ArrayList<Result> getResult
     *         returns the result history
     * @return
     *     returns rHistory.
     */
    public ArrayList<Result> getResults() {
        return rHistory;

    }
}
