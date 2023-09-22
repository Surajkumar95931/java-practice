import java.util.Scanner;
import java.util.*;

public class ArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many number you want to add in array");
        int num = sc.nextInt();
        int arr1[] = new int[num];
        System.out.println("enter element of 1st array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter element of 2nd array");
        int arr2[] = new int[num];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("first array");
        print(arr1);
        System.out.println("second array");
        print(arr2);
        int mergedArray[] = mergeArrays(arr1, arr2);
        System.out.println("your array after merge and duplicate not here");
        print(mergedArray);
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Create a HashSet to store unique elements from both arrays
        HashSet<Integer> uniqueElements = new HashSet<>();

        // Add elements from arr1 to the HashSet
        for (int i : arr1) {
            uniqueElements.add(i);
        }

        // Add elements from arr2 to the HashSet
        for (int i : arr2) {
            uniqueElements.add(i);
        }

        // Create a new array to store the merged unique elements
        int[] mergedArray = new int[uniqueElements.size()];

        // Copy elements from the HashSet to the mergedArray
        int index = 0;
        for (int i : uniqueElements) {
            mergedArray[index] = i;
            index++;
        }

        return mergedArray;
    }
}

