import java.util.*;
public class Alpha_Hill{
    public static void main(String []args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int k=1;k<=2*i+1;k++){
                System.out.print(ch);
                if(k<=breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
             System.out.println();
        }  
    } 
}