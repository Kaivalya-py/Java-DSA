public class HappyNumber {
    public static boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            if (n == 4) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
