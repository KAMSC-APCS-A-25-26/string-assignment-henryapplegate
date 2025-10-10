import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = {"dang", "nuts", "oops", "yikes"};
        String input = scanner.nextLine();

        for (String word : bannedWords) {
            input = input.replaceAll("\\b" + word + "\\b", "***");
        }

        System.out.println("Censored: " + input);
    }
}