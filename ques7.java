// QUESTION:-
// The key constraint is if the number is 5 digits long.It'll contain digits from 1 to 5 without missing and repeating any digit form 1 to 5.
// The inverse of a number is defined as the number created by interchnaging the face value and index of digits of number.


import java.util.*;

public class ques7{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int op = 1;
        int inv = 0;
        
        while( n != 0){
            int od = n%10;
            int ip = od;
            int id = op;
            
            inv = inv + id*(int)Math.pow(10,ip-1);
            
            n = n/10;
            op++;
        }
        System.out.println(inv);

    }
}
