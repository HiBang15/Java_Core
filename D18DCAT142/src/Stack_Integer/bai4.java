package Stack_Integer;
import java.util.*;
public class bai4 {
    public static boolean checkSNT(int n){
        if(n<2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++ )
            if(n%i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Integer> listResult = new LinkedList<>();
        Random rd = new Random();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        StackOfInteger stack = new StackOfInteger(n);

        for(int i = 0; i < n; i++){
            stack.push(i);
        }
        for(int i = 0; i < stack.getMaxSize(); i++){
            int k = stack.pop() ;
            if(checkSNT(k) && k <= n)
                listResult.add(k);
        }
        for (Integer i : listResult) {
            System.out.print( i + " ");
        }
    }
    

}
