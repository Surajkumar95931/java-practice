import java.util.*;
public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 2, 7, 55, 65, 32, 46, 99, 75};
        int tar = 32;
        Arrays.sort(arr);
        int index=bin(arr,tar);
        if (index==-1){
            System.out.println("not found");
        }else{
            System.out.println("found"+index);
        }
    }
    public static int bin(int arr[],int tar){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if (arr[mid]==tar){
                return mid;
            }else if (arr[mid]<tar){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
