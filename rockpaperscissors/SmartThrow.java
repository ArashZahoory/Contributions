package rockpaperscissors;

import java.util.ArrayList;
import java.util.LinkedList;

public class SmartThrow extends GameIntelligence {

    private LinkedList<String> current = new LinkedList<String>();
    ArrayList<Result> rHistory = new ArrayList<Result>();
    ArrayList<String[]> patterns = new ArrayList<String[]>();
    ArrayList<String> threeHistory = new ArrayList<String>();
    ArrayList<String> predictHistory = new ArrayList<String>();
    //ArrayList<String[]> dividedHistory = new ArrayList<String[]>();

    public SmartThrow() {
        rHistory = Match.history.getResults();

    }

    public String[] getAllGestures() {
        String[] history = new String[(rHistory.size() * 2)];
        int i = 0;
        int j = 1;
        for (Result r : rHistory) {
            if (i == history.length) {
                break;
            }
            history[i] = (String) r.getPlayerGesture();
            history[j] = (String) r.getCompGesture();
            //System.out.println(history[i]);
            //System.out.println(history[j]);

            i += 2;
            j += 2;
        }
       // for (String k : history) {
       //     System.out.println(k);}


        return history;

    }
    //Romeo's partition method
    public void patternThrees(){
        String[] pHistory = getAllGestures();
        for(int i=0; i<pHistory.length-2; i+=2){
        threeHistory.add(pHistory[i]+" "+pHistory[i+1]);
        predictHistory.add(pHistory[i+2]);
        }
        //System.out.println(threeHistory);   //test print
        //System.out.println(predictHistory);   //test print
    }

    /*
    public void partitionCurrent() {
        String[] current = getCurrentPattern();
        patterns.add(current);
        for (int i = 5; i > 0; i--) {
            int k = 4;
            if (i > 0) {
                String[] temp = new String[i];
                for (int j = i - 1; j > 0; j--) {
                    temp[j] = current[k--];
                }
                patterns.add(temp);
                patterns.add(temp);
                patterns.add(temp);
            } else {
                break;
            }

        }

    }

    public void appendPatterns() {
        String[] rps = new String[3];
        rps[0] = "r";
        rps[1] = "p";
        rps[2] = "s";
        int i = 3;
        for (String[] s : patterns) {
            s[s.length - 1] = rps[i % 3];
            i++;
        }
    }

    public void setCurrentPattern() {
        for (Result r : rHistory) {
            if (current.size() < 2) {
                current.add(r.getPlayerGesture());
                current.add(r.getCompGesture());

            } else {
                current.removeFirst();
                current.removeFirst();
                current.add(r.getPlayerGesture());
                current.add(r.getCompGesture());
            }
        }
        partitionCurrent();
        appendPatterns();
    }

    public String[] getCurrentPattern() {
        String[] pattern = (String[]) current.toArray();
        return pattern;
    }
    */

    public Gesture getGesture() { // implements abstract class. temporary.

        if (Match.history.getResults().size() > 4) {
            int th = makeSmartThrow();
            if (th != -1) {
                //System.out.println("SmartThrow is being used");
                return new Gesture(th);
            }
        }

        RandomThrow r = new RandomThrow();
        return r.getGesture();

    }

    public int makeSmartThrow() {

        int r =0;
        int p = 0;
        int s= 0;

        patternThrees();
        String compare = threeHistory.get(threeHistory.size()-1);
        //System.out.println("Compare string: "+compare); //test print
        //System.out.println("History string: "+threeHistory.get(0)); //test print
        for(int i =0; i<threeHistory.size()-2;i++)  {
            if(compare.equals(threeHistory.get(i))){
                //System.out.println("inside loop");  //test print
                if(predictHistory.get(i) == "Rock")
                    p++;
                if(predictHistory.get(i) == "Paper")
                    s++;
                if(predictHistory.get(i) == "Scissors")
                    r++;
            }
        }
        //System.out.println(r+" "+p+" "+s);     //test print

        if (r > p && r > s) {
            System.out.println("Prediction of player throw: scissors ");
            return 0;
        } else if (p > r && p > s) {
            System.out.println("Prediction of player throw: rock ");
            return 1;
        } else if (s > p && s > r) {
            System.out.println("Prediction of player throw: paper ");
            return 2;
        } else {
            System.out.println("returning no prediction (-1)");
        }return -1;
       /*
        int r = 0;
        int p = 0;
        int s = 0;
        for (int i = 2; i < 6; i++) {
            ArrayList<String[]> dividedHistory = new ArrayList<String[]>();
            dividedHistory = getPartitions(i);
            for (String[] s1 : patterns) {
                for (String[] s2 : dividedHistory) {
                    if (s1.equals(s2)) {
                        if (s1[s1.length - 1].equalsIgnoreCase("r")) {
                            r++;
                        } else if (s1[s1.length - 1].equalsIgnoreCase("p")) {
                            p++;
                        } else {
                            s++;
                        }
                    }
                }
            }
        }
        */
    }
    /*
    public ArrayList<String[]> getPartitions(int partSize) {
        String[] part = new String[partSize];
        String[] allThrows = getAllGestures();
        // System.out.println("part:" + part);
        // System.out.println("allThrows:" + allThrows);
        ArrayList<String[]> dividedHistory = new ArrayList<String[]>();
        int index = 0;
        while (index < allThrows.length - 1) {
            for (int i = 0; i < partSize; i++) {
                if (index + i < allThrows.length - 1) {//if havent hit end yet
                    part[i] = allThrows[index + i];//
                    //for (String k : part) {
                      //  System.out.println(k);
                    //}
                } else {
                    break;
                }
                //dividedHistory.add(part);
            }

            index = index + partSize;
        }
        // System.out.println()
        return dividedHistory;
    }
    */
}
