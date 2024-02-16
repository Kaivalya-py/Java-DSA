import java.util.Scanner;
public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if (isBinaryPalindrome(n)) {
            System.out.println("Binary Palindrome");
        } else {
            System.out.println("Not a Binary Palindrome");
        }
        inp.close();
    }

    static boolean isBinaryPalindrome(int n) {
        int rev = 0;
        int copyNum = n;
        System.out.println("initial n:"+Integer.toBinaryString(n));
        System.out.println("initial rev:"+Integer.toBinaryString(rev));
        while(n>0){
            rev = rev<<1;
            System.out.println(Integer.toBinaryString(rev));
            if((n&1)==1){
                System.out.println(Integer.toBinaryString(n));
                rev = rev^1;
                System.out.println(Integer.toBinaryString(rev));
            }
            n = n>>1;
            System.out.println(Integer.toBinaryString(n)+"\n");

        }
        return rev==copyNum;
    }
}
