package lecture_02;
import java.util.*;

public class Pattern12 {
    public static void main(String[]  args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val1 =0;
        int val2 =1;

        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(val1+ "\t");
                int val3 = val1+val2;
                val1 = val2;
                val2 = val3;

            }
            System.out.println();
        }
        

        // for(int i=1; i<=n; i++){
        //     if(i==1){
        //         System.out.print(val1+"\t");
        //         val1 = 1;
        //     }
        //     else if(i==2){
        //         System.out.print(val2 + "\t"+ val2);
        //     }
        //     else if(i>2){
        //         for(int j =1; j<=i; j++){
        //             int val3 = val1+ val2;
        //             System.out.print(val3 + "\t");
        //             val1 = val2;
        //             val2 = val3;

        //         }
                
        //     }
        //     System.out.println();

        
        }
    }

    

