import java.util.*;
public class MergedArray {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();//it provide value without duplicates
       // ArrayList<Integer> h=new ArrayList<>();
        //LinkedList<Integer> h=new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of the 1st array");
        int arr1[] = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            h.add(arr1[i]);
        }
        System.out.println("Enter elements of the 2nd array");
        int arr2[] = new int[3];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
            h.add(arr2[i]);
        }

        Integer[] array = h.toArray(new Integer[h.size()]);
        System.out.println("new array after merged");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("yhankyou for everything");
    }
}
