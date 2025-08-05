package lecture_01;
// Question;-
// Benjamin Bulbs 
// Take "n " as input for no of bulbs and no of circuits fluctutaion.
// initially all bulbs are closed.
// for 1st fluctuation, all bulbs toggled, for 2nd fluctuation only multiple of 2 are toggle and on 3rd fluctuation bulbs with multiple of 3 are toglled and so on.
// print all the bulbs which are ON after the final fluctuation.

// NOTE:-
// no of factors in perfect square = 2n+1 (odd )
// no of factors in other no = 2n (even)
// and bulb with odd factors are on as they are initailly off.

import java.util.*;

public class ques12{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i =1; i*i <=n; i++){
            System.out.println(i*i);
        }
    }
}