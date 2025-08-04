// QUESTION:-
// You have to count the number of digits in the number.
// Take as input "n"the number for which the digitshas to be counted.
// Print the digits in the number.

// CONSTRAINTS:-
// 1<=n<10^9

import java.util.*;

public class ques4{
    public static void main(String[] args){

        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        int count = 0 ;

        while(n!=0){
            n =n/10;
            count++;
        }
        System.out.println(count);
        

    }
}