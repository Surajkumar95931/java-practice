import java.util.*;

public class union_intersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("union" + union);
        System.out.println(union.size());
        System.out.println("intersection" + intersection);
        System.out.println(intersection.size());
    }
}
