package rockpaperscissors;
/**
 * Class Summary
 *   This class is in control of an individual round.
 *   It constructs a round object, the users (the human and computer),
 *   plays the round, and then stores the results of a round
 *   in a result object which it returns.
 *		
 */
 
public class Round {
/**
 *  User human --
 *     The user object that will be played by the human.
 *  Computer cpu --
 *     The computer object, subclass of player, that will be controlled
 *     by the computer.
 *  Referee judge --
 *     Referee object that is used to determine the outcome of a round.
 */
	private User human;
	private Computer cpu;
	private Referee judge;
    String lastResult;
        
/**
 *  Round () --
 *	Default constructor to initialize member fields.
 */
  public Round (String difficulty)
  {
    human = new User();
    cpu = new Computer(difficulty);
    judge = new Referee ();
  }
  
  
  /**
   * Result playRound () --
   *	Is the process of playing a round of rps, it gets the gestures
   *    from the cpu and human and determines the winner.
   *    It then returns the result
   * @return r
   *    The result of the round
   */
  public Result playRound()
  {
    System.out.println("-------PLAYING A ROUND-------");
    Result r = judge.determineWinner(cpu.getPlayerGesture(), human.getPlayerGesture() );

    // Display who won the round
    
    return r;
    //return judge.determineWinner( human.getPlayerGesture(), cpu.getPlayerGesture() );
  
  }
  
}