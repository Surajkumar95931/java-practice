import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 12345;
        System.out.println(sum(n, reverse(n)));
    }
    public static int reverse(int n) {
        int reverse = 0;
        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        return reverse;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
