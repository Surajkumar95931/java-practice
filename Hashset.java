import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("how many city name you want to enter");
        int n = sc.nextInt();
        String arr[] = new String[n+1];
        for (int i = 0; i <= n; i++) {
            String val = sc.nextLine();
            System.out.println("enter value"+i);
            hs.add(val);
            arr[i] = val;
        }
        System.out.println("you entered these names");
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("your answer is");
        for (String city : hs) {
            System.out.println(city);
        }
    }

}
