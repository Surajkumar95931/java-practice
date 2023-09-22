public class reverse {
    public static void main(String[] args) {
        int num = 21474;
        System.out.println(num);
        System.out.println(reverse(num));
    }
    public static int reverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
}
