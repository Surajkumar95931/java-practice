import java.util.*;

public class String_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String name = sc.nextLine();

        String rev = reverse(name);
        System.out.println( rev);

    }

    public static String reverse(String name) {
        char[] charArr = name.toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        while (left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);
    }
}
