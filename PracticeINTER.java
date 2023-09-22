//import javax.print.attribute.IntegerSyntax;
import java.util.*;
public class PracticeINTER {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> h=new HashSet<>();
        System.out.println("How many element you want to add in array");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter element of 1st array");
        for (int i=0;i< arr1.length;i++){
            arr1[i]=sc.nextInt();
            h.add(arr1[i]);
        }
        int[] arr2=new int[n];
        System.out.println("Enter element of 2nd array");
        for (int i=0;i< arr2.length;i++){
            arr2[i]=sc.nextInt();
            h.add(arr2[i]);
        }
        Integer[] merge=h.toArray(new Integer[h.size()]);
        System.out.println("your new array after merge of 1st and 2nd array is");
        for (int i=0;i< merge.length;i++){
            System.out.print(merge[i]+" ");
        }
        System.out.println();
    }
}
