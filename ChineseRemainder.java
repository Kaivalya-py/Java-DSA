import java.util.Scanner;

public class ChineseRemainder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] div = new int[n];
        int[] rem = new int[n];
        for (int i = 0; i < n; i++) {
            div[i] = inp.nextInt();
        }
        for (int i = 0; i < n; i++) {
            rem[i] = inp.nextInt();
        }
        System.out.println(chineseRemainder(div, rem, n));
        inp.close();       
    }

    static int chineseRemainder(int div[], int rem[], int n){
        int x = 1;
        while (true){
            boolean found = true;
            for (int i=0; i<n; i++){
                if(x%div[i]!=rem[i]){
                    found = false;
                    break;
                }
            }
            if(found)
                return x;
            x++;
        }
    }
}
