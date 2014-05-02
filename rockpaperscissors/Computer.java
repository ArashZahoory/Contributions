
package rockpaperscissors;
/**
 *	Field Summary:
 *    String name --
 *			A unique identifier for each player.  This is to not confuse
 *                      the application or player when finding out who he is playing against.
 * 
 *	GameIntelligence ai --
 *			Provides the logic of the computer, random at this point in time.
 *
 *	Constructor Summary:
 *		Computer () --
 *			Creates a standard CPU with a new GameIntelligence	
 *	
 *	Method Summary:
 *		Gesture getPlayerGesture () --
 *			This method gets a gesture from the computer player
 *                      which is random at this point in time.
 */
public class Computer implements Player {
	// Class fields
  private String name;
  private GameIntelligence ai;
	
  // Constructors
  public Computer(String difficulty) 
  { 
    name = "AI"; 
    ai = GameIntelligence.initialize(difficulty);
  }
  

	
  public Gesture getPlayerGesture() {
     return ai.getGesture();
 }
}