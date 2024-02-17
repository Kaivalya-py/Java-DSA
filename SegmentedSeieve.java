import java.util.Scanner;

public class SegmentedSeieve {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int low = inp.nextInt();
        int high = inp.nextInt();
        segmentedSeieve(low, high);
        inp.close();
        
    }

    static void segmentedSeieve(int low, int high){
        boolean[] prime = new boolean[high+1];
        for(int i=0; i<=high; i++){
            prime[i] = true;
        }

        for(int i=2; i*i<=high; i++){
            int start = (low/i)*i;
            if(start<low){
                start += i;
            }
            for(int j=start; j<=high; j+=i){
                prime[j] = false;
            }
        }

        for(int i=low; i<=high; i++){
            if(prime[i] == true){
                System.out.print(i+" ");
            }
        }
    }
    
}
