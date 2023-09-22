public class stringRevWordByWord {

        public static void main(String[] args) {
            String inputString = "my name is suraj";

            // Split the string into words using space as the delimiter
            String[] words = inputString.split(" ");

            // Create a StringBuilder to build the reversed string
            StringBuilder reversedString = new StringBuilder();

            // Iterate through the words using a for-each loop
//            for (String word : words) {
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                reversedString.append(reversedWord).append(" ");
            }

            // Remove the trailing space and print the reversed string
            String finalResult = reversedString.toString().trim();
            System.out.println("Input String: " + inputString);
            System.out.println("Reversed String: " + finalResult);
        }
    }
