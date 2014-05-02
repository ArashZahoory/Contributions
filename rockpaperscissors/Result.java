package rockpaperscissors;
public class Result {
	/**
         *             String winner --
         *			Stores a copy of the Player.Name field indicating who won
         *			the individual round.
         *		Gesture playerGesture : stores player's Gesture.
         *		Gesture compGesture :  store player's Gesture.
         *              String rock : contains the string "Rock"
         *              String paper : contains the string "Paper"
         *              String scissors : contains the string "Scissors"
         */
	private String winner;
	private Gesture playerGesture;
	private Gesture compGesture;
	String rock ="Rock";
	String paper = "Paper";
	String scissors = "Scissors";
	
        
        
        /**
         * Constructor Summary:
         *		Result (String, Gesture, Gesture) --
         *			Gives the information for winner, playerGesture, and
         *                      compGesture.
         * @param w
         * @param comp
         * @param player 
         */
	public Result(String w, Gesture comp, Gesture player ){
		winner = w;
		playerGesture = player;
		compGesture = comp;
	}
	
        /**
         * String getWinner () --
         *		Returns the name of the winner of the round.
         * @return 
         *      winner
         */
	public String getWinner(){
		return winner;
	}
	
        /**
         * String getPlayerGesture
         *      - Returns the playersGesture as a string.
         * @return 
         *      - The string of players gestures.
         */
	public String getPlayerGesture(){
		if (playerGesture.getGesture() == 0) 
			return rock;
		else if(playerGesture.getGesture() == 1)
			return paper;
		else if(playerGesture.getGesture() == 2)
			return scissors;
		return null;
	}
	
        
        /**
         * String getCompGesture
         *      - Returns the computers gesture.
         * @return 
         *      - The string of the computers gesture.
         */
	public String getCompGesture(){
		if (compGesture.getGesture() == 0) 
			return rock;
		else if(compGesture.getGesture() == 1)
			return paper;
		else if(compGesture.getGesture() == 2)
			return scissors;
		return null;
	}
	
}
