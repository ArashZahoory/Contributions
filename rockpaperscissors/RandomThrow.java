package rockpaperscissors;
/**
 *
 * @author ryanlichtig
 */
public class RandomThrow extends GameIntelligence {
    
    public Gesture getGesture(){
        //System.out.println("RandomThrow is being used");
        return makeRandomThrow();
    
    }

    public Gesture makeRandomThrow(){
        int g1 = (int) Math.floor(Math.random()*3);
        return new Gesture(g1);
    }
}
          
