import java.util.*;
public class String_rev1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String name=sc.nextLine();

        StringBuilder s=new StringBuilder();
        s.append(name);
        s.reverse();
        System.out.println(s.toString());
    }
}
