package IA.ProbIA5;

import IA.probIA15.ProbIA15Board;
import aima.search.framework.SuccessorFunction;
import aima.search.framework.Successor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bejar on 17/01/17
 */
public class ProbIA5SuccesorFunction implements SuccessorFunction{

    public List getSuccessors(Object state){
        ArrayList retval = new ArrayList();
        ProbIA5Board board = (ProbIA5Board) state;

        // Some code here
        // (flip all the consecutive pairs of coins and generate new states
        // Add the states to retval as Succesor("flip i j", new_state)
        // new_state has to be a copy of state
        for(int i=0;i<5;i++) {
            ProbIA5Board newBoard = new ProbIA5Board(board);
            newBoard.flip_it(i);
            retval.add(new Successor(new String("flip position " + String.valueOf(i) + " "
                    + String.valueOf((i+1)%5)+ ": " + state.toString()+ " -> " + newBoard.toString()),newBoard));

        }

        return retval;

    }

}
