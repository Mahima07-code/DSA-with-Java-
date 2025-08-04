// QUESTION:-
// #You have to print all prime no between a range .
// #Take as input "low", th elower limit of range.
// #Take as input "high", the hoggher limit of range.
// #For the range print all the prime numbers between low anf high(both included).

// CONSTRAINTS
// 2<= low <high <10^6


import java.util.*;

public class ques2{
    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);

        int low = scn.nextInt();
        int high = scn.nextInt();

        for ( int num = low; num<= high; num++){                          // if num = 2, loop skipped as condition false 
            int count = 0;

            for (int div =2; div *div <= num ; div++){
                if( num%div == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println(num);
            }
        }

    }
}
