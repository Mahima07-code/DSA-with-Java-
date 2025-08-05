// Question:-
// You have to calculate GCD and LCM of given two numbers.
// Take n1 and n2 as input numbers.
// GCD = Greatest common divisor.
// LCM = Lowest common multiplier.

import java.util.*;

public class ques9{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int on1 = n1;
        int on2 = n2;

        while(n1 != 0){
            int r = n2%n1;

            n2 = n1;          // The divisor worls as dividend .
            n1 = r;           // The reaminder works as divisor.
        }         

        int gcd = n2;
        int lcm = (on1*on2)/gcd ;

        System.out.println("GCD = "+gcd);
        System.out.println("LCM =  "+lcm);
    }
}