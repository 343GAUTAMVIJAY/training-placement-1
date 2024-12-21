import java.util.Scanner;

public class Solution{

    private static boolean flag=true;
    private static int B;
    private static int H;

    static{
        try (Scanner scanner=new Scanner(System.in)){
            B=scanner.nextInt();
            H=scanner.nextInt();

            if (B <= 0 || H <= 0){
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception exception){
            flag=false;
            System.out.println(exception);
        }
    }

    public static void main(String[] args){
        if (flag){
            int area=B * H;
            System.out.print(area);
        }
    }
}
