import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {5, 8, 9, 2, 7, 55, 65, 32, 46, 99, 75};
        int tar = 32;
        Arrays.sort(arr);
        int index=linear(arr,tar);
        if (index!=-1){
            System.out.println("found at "+index);
        }else{
            System.out.println("not found");
        }
    }

    public static int linear(int arr[], int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }
}
