package lecture_01;
// QUESTION:-
// You have to print the digits of a number in reverse order.
// Take as input "n".

import java.util.*;

public class ques6{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        while(n != 0){
            int d = n % 10;
            System.out.println(d);
            n = n/10;
        }
    }
}