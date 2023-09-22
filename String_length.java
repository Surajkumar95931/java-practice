import java.util.Scanner;

public class String_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        int a = name.length();
        System.out.println("length is " + a);
    }
}
