package IA.ProbIA5;

import IA.probIA15.ProbIA15Board;

/**
 * Created by bejar on 17/01/17.
 */
public class ProbIA5Board {
    /* Class independent from AIMA classes
       - It has to implement the state of the problem and its operators
     *

    /* State data structure
        vector with the parity of the coins (we can assume 0 = heads, 1 = tails
     */

    private int [] board;
    private static int [] solution;

    /* Constructor */
    public ProbIA5Board(int []init, int[] goal) {

        board = new int[init.length];
        solution = new int[init.length];

        for (int i = 0; i< init.length; i++) {
            board[i] = init[i];
            solution[i] = goal[i];
        }

    }

    /* vvvvv TO COMPLETE vvvvv */
    public void flip_it(int i){
        // flip the coins i and i + 1
        board[i] = board[i] ^ 1;
        board[(i+1)%5] = board[(i+1)%5] ^ 1;
    }

    /* Heuristic function */
    public double heuristic(){
        // compute the number of coins out of place respect to solution
        double h = 0;
        for(int i=0;i<5;i++) {
            if (board[i] == solution[i]) h++;
            else h--;
        }
        return h;
    }

     /* Goal test */
     public boolean is_goal(){
         boolean iguales=true;
         int i = 0;
         while (i < 5 && iguales){
             iguales = (board[i]==solution[i]);
             ++i;
         }
         return (iguales);
     }

     /* auxiliary functions */

     // Some functions will be needed for creating a copy of the state

    /* ^^^^^ TO COMPLETE ^^^^^ */

    public ProbIA5Board(ProbIA5Board p) {
        board = new int[5];
        for(int i=0;i<5;i++) this.board[i] = p.board[i];
    }
}
