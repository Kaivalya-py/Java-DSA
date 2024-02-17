import java.util.Scanner;

public class EulerPhi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(eulerPhi(n));
        inp.close();    
        
    }

    static int eulerPhi(int n){
        int result = n;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                }
                result -= result/i;
            }
        }
        if(n>1)
            result -= result/n;
        return result;
    }
}
