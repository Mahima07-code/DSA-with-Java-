// QUESTION:-
// You have to print first n fibbonacci numbers.
// Take as input "n" the count of fibonacci numbers to print .
// Print first n fibonacci numbers.

// Constraints:-
// 1<= n <40

import java.util.*;

public class ques3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int n1 =0;
        int n2 =1;

        for(int i=0; i<n; i++){
            System.out.println(n1);
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
    }
}