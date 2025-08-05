package lecture_01;
// QUESTION:-
// You have to print the digits of a number.
// Take as input "n".

// CONSTRAINTS:-
// 1<= n < 10^9

import java.util.*;
 
public class ques5{
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        int num = n ;

        while(n != 0){
            n = n /10;
            count++;
        }

        for (int i = count; i >= 1; i--){
            int d = num / (int)Math.pow(10, i-1);
            System.out.println(d);
            num = num - d*(int)Math.pow(10, i-1);
        }

    }
}
