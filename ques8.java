// QUESTION :-
// Rotate a number
// Take input as "n" for the number.
// Take input as "k" for the number of rotation.

import java.util.*;

public class ques8{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int temp = n ;
        int nod =0;
        // count the number of digits.
        while( temp!= 0){
            temp = temp/10;
            nod++;
        }
        
        k = k % nod;             // if k > nod
        if(k<0){                // for negative value to turn them positive.
            k = k +nod;
        }

        int q = n/(int)Math.pow(10,k);
        int r = n % (int)Math.pow(10,k);

        int rot_no = r*(int)Math.pow(10,nod-k) + q;

        System.out.println(rot_no);
    }
}

