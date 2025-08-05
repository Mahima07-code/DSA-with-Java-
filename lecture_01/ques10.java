package lecture_01;
// Question:-
// Prime Factorisation of a given number .
// Take a number input as "n".
// Print all the prime factors of n in the same line with tab  space.

import java.util.*;

public class ques10{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int div =2; div*div <= n; div++){
            while(n%div == 0){
                n = n/div;
                System.out.print(div+" ");
            }
        }
        // when factor is greater is than root n i.e itself 
        if(n != 1){
            System.out.print(n);
        }
    }
}