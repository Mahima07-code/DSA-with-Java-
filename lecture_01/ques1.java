package lecture_01;
// QUESTION :-
// #You have to check whether the series of input is prime or not.
// #Take a number "t" as input representing count of input numbers to be tested. 
// #Take a no "n" as input "t" number of times.
// #For each input value n print either prime or not prime .


import java.util.*;

public class ques1 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();                                       // Take a no input as count of input no                        

        for (int i=0; i< t; i++ ){
            int n = scn.nextInt();
            
            int count = 0;
            for (int div = 2; div *div <= n ; div++){                   // To check prime start divide from 2 to n^1/2 
                if (n%div == 0){
                    count++;
                    break;                                             // Minimize no of unnecessary loops using break
                }
            }

            if (count == 0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");

            }
        }



    }
    
}

