import java.util.*;
public class HASH_example {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("how many student you want to put in hashmap");
        int n=sc.nextInt();
        int arr[]=new int [n];
        sc.nextLine();
        for(int i=0;i< n;i++){
            System.out.println("Enter student id");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter student name");
            String name=sc.nextLine();
            h.put(id,name);


        }
        System.out.println("your student is"+h);
    }
}
