package lecture_01;
import java.util.*;

public class ques13 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int d = scn.nextInt();
            int count = 0;

            while(n !=0){
                int rem = n%10;
                if(rem == d){
                    count++;    
                }
                n /= 10;
            }
            System.out.println(count);
    }
    
}
