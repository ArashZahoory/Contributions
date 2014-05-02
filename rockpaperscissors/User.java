/**
 * Class Summary - 
 *      This class creates the player, which implements User. Allowing for use of the
 *      getPlayerGesture in the Player interface.
 */
package rockpaperscissors;
public class User implements Player {
  /**
   * String name - 
   *     A unique for each player. Name is used when displaying results so that the application
   *     user can differentiate between the different players.
   */
  private String name;
  
  /**
   * Constructor Summary - 
   *    Default constructor.
   */
  public User () { name = "User"; }
  
  /**
   * Method Summary - getPlayerGesture
   *   Read the user's gesture selection in and set it.
   * @return the players gesture.
   */
  public Gesture getPlayerGesture () {
    GameMenu m = new GameMenu();
    m.displayNumThrowInputRequest();
    
    Input in = new Input();
    return new Gesture( in.getThrow() );
  }
}