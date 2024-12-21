import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i=0;

        while (scanner.hasNext()){
            String frase=scanner.nextLine();
            i++;
            System.out.println(i + " " + frase);
        }

        scanner.close();
    }
}
