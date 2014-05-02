package rockpaperscissors;
public class Referee {

 /**   Result determineWinner (Gesture, Gesture) --
 *			This method determines the winner of a round by comparing
 *                      the gesture of the computer and player. Then returns the
 *                      result.
 *      @return result
 *           Contains result(winner, compGesture, PlayerGesture)
 *           The winner of the round, the computers gesture, and the players gesture.
 */
    Result determineWinner(Gesture comp, Gesture play){

        if(comp.getGesture() == play.getGesture()){
            return new Result("tie", comp, play);
        }else if(comp.getGesture()==0 && play.getGesture()==2){//rock vs. scissors
            return new Result("comp", comp, play);
        }else if(play.getGesture()==0 && comp.getGesture()==2){//rock vs. scissors
            return new Result("player", comp, play);
        }else if(comp.getGesture() > play.getGesture()){
            return new Result("comp", comp, play);
        }else{
            return new Result("player", comp, play);
        }
    }
}