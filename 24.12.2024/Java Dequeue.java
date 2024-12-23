    import java.util.*;

    public class test{
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int m=in.nextInt();
            
            Deque<Integer> subArray=new ArrayDeque<>(m);
            Set<Integer> uniqueIntegers=new HashSet<>(m);
            
            int maxUniqueIntegers=0;
            
            for (int i=0; i < n; i++){
                int newInteger=in.nextInt();
                
                if (i >= m){
                    int removedValue=subArray.removeFirst();
                    if (!subArray.contains(removedValue)){
                        uniqueIntegers.remove(removedValue);
                    }
                }          
                
                subArray.addLast(newInteger);
                uniqueIntegers.add(newInteger);
                
                maxUniqueIntegers=Math.max(maxUniqueIntegers, uniqueIntegers.size());
            }
            
            System.out.println(maxUniqueIntegers);
        }
    }




