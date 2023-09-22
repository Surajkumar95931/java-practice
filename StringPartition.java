import java.util.Scanner;

public class StringPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();

        System.out.println("prefix");
        for (int i = 0; i <= name.length(); i++) {
            System.out.println(name.substring(0, i));
        }
        System.out.println("suffix");
        for (int i = 0; i <= name.length(); i++) {
            System.out.println(name.substring(i));
        }
    }
}
