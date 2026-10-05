import java.util.Scanner;

public class SentenceRebuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        StringBuilder newFormat = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            newFormat.append(words[i].toUpperCase());
            if (i < words.length - 1) {
                newFormat.append("-");
            }
        }

        System.out.println("Rebuilt Sentence: " + newFormat.toString());

        scanner.close();
    }
}
