// QUESTION13
// Calculate the frequency of the given digit in the given no 
// Take "n" as input number and "d" be the digit to count teh frequency of.



package lecture_01;
import java.util.*;

public class ques13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int d = scn.nextInt();
            int freq = DigitFrequency(n,d);
            System.out.println(freq);

    }

    public static int DigitFrequency(int x, int y){
        int count = 0;

        while(x >0){
            int rem = x%10;

            if(rem == y){
                count++;    
            }
            
            x /= 10;
        }
        return count;
    } 
}
    

