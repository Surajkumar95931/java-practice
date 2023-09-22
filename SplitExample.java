public class SplitExample {
    public static void main(String[] args) {
        String sentence = "in Java";

        String[] words = sentence.split(" ");

       StringBuilder rs=new StringBuilder();
        for (int i=0;i< words.length;i++){
            String word=words[i];
            StringBuilder reversed=new StringBuilder(word);
            reversed.reverse();
            rs.append(reversed);

            if (i< words.length-1){
                rs.append(" ");
            }

        }
        String finalResult=rs.toString();
        System.out.println("reverse string is");
        System.out.println(finalResult);
    }
}
