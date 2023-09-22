public class Array_pair {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 4, 8, 7};
        pair(arr);
    }

    public static void pair(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int sum = current + arr[j];
                System.out.print("(" + current + "," + arr[j] + ")= "+sum);
            }
            System.out.println();
        }
    }
}
