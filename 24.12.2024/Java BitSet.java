import java.io.*;
import java.util.*;
import java.lang.reflect.Method;

class BitMe{
    private BitSet b1;
    private BitSet b2;
    private int nbits;
    
    public BitMe(int nbits){
        this.nbits=nbits;
        this.b1=new BitSet(nbits);
        this.b2=new BitSet(nbits);       
    }
    
    public void getOperation(String line){
        String[] operation=line.split(" ");
        String cmd=operation[0].toLowerCase();
        String arg1=operation[1];
        String arg2=operation[2];
        BitSet target1=(arg1.equals("1")) ? b1 : b2;
        
        if(!cmd.equals("flip")&&!cmd.equals("set")){
            BitSet target2=(arg2.equals("1")) ? b1 : b2;
            doABarrelRoll(cmd,target1,target2);
            }
        else{
            int target2=Integer.parseInt(arg2);
            doABarrelRoll(cmd,target1,target2);
            }   
    }
    
    private void doABarrelRoll(String cmd,BitSet target1,Object bint){
        try{
            
            if(bint instanceof BitSet){
                Method method=BitSet.class.getMethod(cmd, BitSet.class);
                method.invoke(target1, bint);
            } else{
                Method method=BitSet.class.getMethod(cmd, int.class);
                method.invoke(target1, bint);
            }
            countBits();
        }
        catch(Exception e){
            System.err.println("cmd:"+cmd);
            e.printStackTrace();
            }
        
    }
    
    private void countBits(){
        int c1=b1.cardinality();
        int c2=b2.cardinality();
        System.out.printf("%d %d%n",c1,c2);
    }
    
}

public class Solution{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();sc.nextLine();
        BitMe beatIt=new BitMe(n);
        for(int i=0;i < m;i++) beatIt.getOperation(sc.nextLine());
        sc.close();
    }
}
