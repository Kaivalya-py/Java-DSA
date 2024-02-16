import java.util.Scanner;

public class Strobogrammatic {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        char[] inputString = str.toCharArray();
        if (isStrobogrammatic(inputString)) {
            System.out.println("Strobogrammatic");
        } else {
            System.out.println("Not Strobogrammatic");
        }
        inp.close();
    }

    static boolean isStrobogrammatic(char[] str) {
        int left = 0;
        int right = str.length - 1;

        for(;left<=right;left++,right--){
            if(str[left] == '0' || str[left] == '1' || str[left] == '8'){
                if(str[left] != str[right])
                    return false;
            }
            else if(str[left]!='6' && str[left]!='9')
                return false;
            else if(str[left]=='9' && str[right]!='6')
                return false;
        }
        return true;
    }
}