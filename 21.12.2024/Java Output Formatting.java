import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for (int i=0;i < 3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int len=s1.length();
            int n=15 - len;

            System.out.print(s1);

            for (int j=1;j <= n;j++){
                System.out.print(" ");
            }

            if (String.valueOf(x).length() == 1){
                System.out.println("00" + x);
            } else if (String.valueOf(x).length() < 3){
                System.out.println("0" + x);
            } else{
                System.out.println(x);
            }
        }
        System.out.println("================================");
        sc.close();// Close the scanner to prevent resource leaks
    }
}
