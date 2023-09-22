import java.util.*;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Character> characters = new LinkedHashSet<>(); // Use LinkedHashSet for maintaining order

        System.out.println("Enter your string:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            characters.add(c);
        }

        System.out.println("Removing duplicates with maintaining order:");
        for (char c : characters) {
            System.out.print(c);
        }
    }
}
