/**
 *
 *	Constructor Summary:
 *		Default constructor.
 *
 *	Method Summary:
 *		Gesture getGesture () --
 *			Computer selects a random gesture and returns it.
 */
package rockpaperscissors;

public abstract class GameIntelligence {
	// Fields
        private static String smart = "smart";
        //private static String random = "random";
	
	// Method Prototypes
        public static GameIntelligence initialize (String difficulty) {
            if (difficulty.compareToIgnoreCase(smart) == 0) 
            {
                return new SmartThrow();
            } 
            return new RandomThrow();            
        }
        
        public abstract Gesture getGesture(); 
}