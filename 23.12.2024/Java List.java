import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i=0;i < n;i++){
            list.add(scan.nextInt());
        }
        int m=scan.nextInt();
        for (int i=0;i < m;i++){
            String operation=scan.next();
            if (operation.equals("Insert")){
                list.add(scan.nextInt(), scan.nextInt());
            }else if (operation.equals("Delete")){
                list.remove(scan.nextInt());
            }
        }
        for (Integer element : list){
            System.out.print(element + " ");
        }
    }
}
