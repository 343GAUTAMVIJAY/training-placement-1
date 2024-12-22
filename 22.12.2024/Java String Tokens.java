import java.io.*;
import java.util.*;

public class Solution{

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        

    String[] s1=s.split("[^a-zA-Z]+");
    System.out.println(s1.length);

    for(String x:s1){
        if(!x.isEmpty()){ 
            System.out.println(x);
        }
    }
        scan.close();
    }
}

