import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter nth number");
        int a = sc.nextInt();
        System.out.println("even numbers");
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println("odd numbers");
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }}
