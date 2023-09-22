import java.util.*;

public class Student {
    static class stud implements Comparable<stud> {
        int rank;
        String name;
        int marks;
        String division;

        public stud(int rank, String name, int marks, String division) {
            this.rank = rank;
            this.name = name;
            this.marks = marks;
            this.division = division;
        }

        public int compareTo(stud s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // ArrayList<stud> boy = new ArrayList<>();
        PriorityQueue<stud> boy = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that how many stud details you want to add");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter rank of: " + i + " student");
            int rank = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: " + i + " student");
            String name = sc.nextLine();

            System.out.print("Enter marks: " + i + " student");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter division: " + i + " student");
            String division = sc.nextLine();

            boy.add(new stud(rank, name, marks, division));
        }

        while (!boy.isEmpty()) {
            System.out.println(boy.peek().rank + " " + boy.peek().name + " " + boy.peek().marks + " " + boy.peek().division);
            boy.remove();
        }


//        System.out.println("rank  "+"name "+"marks "+" division");
//        for (stud k : boy) {
//            System.out.println(k.rank + "\t" + k.name + "\t" + k.marks + "\t" + k.division);
//        }

    }
}
