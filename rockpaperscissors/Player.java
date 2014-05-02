/**
 *	Field Summary:
 *		String name --
 *			A unique identifier for each player.  Name is used when displaying
 *			results so that application user can differentiate between the 
 *			different players.
 *	
 *	Method Summary:
 *		Gesture getPlayerGesture --
 *			This method will be used by each class that is a subclass of this
 *                      one to get the gesture of that player.
 */
package rockpaperscissors;
public interface Player {
	
	// Method prototypes
	public Gesture getPlayerGesture();
}