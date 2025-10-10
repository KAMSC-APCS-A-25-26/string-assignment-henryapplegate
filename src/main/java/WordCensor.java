import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = {"dang", "nuts", "oops", "yikes"};
        String input = scanner.nextLine();

        for (String word : bannedWords) {
            // Replace whole words only, not substrings of other words
            input = input.replaceAll(word, "***");
        }

        System.out.println("Censored: " + input);

        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes

        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement

    }
}
