import java.util.*;

public class Prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();

        for(int i=start; start<=end; i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }

    }

    static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
