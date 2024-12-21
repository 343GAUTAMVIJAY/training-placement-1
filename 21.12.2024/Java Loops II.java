import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        for (int i=0; i < t; i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            int s=0;
            int b1=0;

            for (int j=0; j < n; j++){
                b1=b1 + ((int) Math.pow(2, j) * b);
                s=a + b1;
                System.out.printf("%s ", s);
            }
            System.out.println();
        }
        
        in.close();
    }
}
