package lecture_02;
import java.util.*;

public class pattern1 {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       
       int n = scn.nextInt();
       for(int i =0; i<n; i++){
        for(int j =0; j< i+1; j++){
            System.out.print("*" + "\t");
        }
        System.out.println();
       }
    }
    
}
