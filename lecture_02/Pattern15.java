package lecture_02;
import java.util.*;

public class Pattern15 {
    public static void main(String[]  args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n/2;
        int val =1;
        int num = 1;

        for(int i =1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");

            }
                
            int cnum =num;
            for(int j=1; j<=val; j++){
                System.out.print(cnum+"\t");
                if(j<=val/2){
                    cnum++;
                }else{
                    cnum--;
                }
            
            }

         
            if(i<= n/2){
                sp--;
                val+=2;
                num++;
               
            }else{
                sp++;
                val-=2;
                num--;
              
            }
            System.out.println();
        }
    }
    
}
