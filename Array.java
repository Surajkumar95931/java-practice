import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to add in an array");
        int num = sc.nextInt();
        int original[] = new int[num];


        for (int i = 0; i < num; i++) {
            System.out.println("Enter " + i + " ");
            original[i] = sc.nextInt();
        }
        System.out.println("for print my original array");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
        System.out.println("reversed array");
        int reversed[] = reverse(original);
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();

        System.out.println("sum of arr 1 and arr2 "+sumOf(original,reversed));
    }

    public static int[] reverse(int[] arr) {
        int rev = 0;
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        return arr;
    }

    public static int[] sumOf(int[] arr1, int[] arr2) {
        int[] sum = new int[arr1.length]; // Create a new array to store the sum
        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i] + arr2[i]; // Add corresponding elements
        }
        return sum;
    }
}

