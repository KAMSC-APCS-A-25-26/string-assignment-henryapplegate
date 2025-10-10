import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // TODO: Create a Scanner and read a full line from the user with nextLine().
        //       Keep the original input string so you can print it in the final message.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // TODO: Build a lowercase version of the input for checking (case-insensitive comparison).
        //       (You don't need to remove spaces/punctuation for the current tests.)
        String inputLower = input.toLowerCase();
        String inputBack = "";

        // TODO: Determine whether the lowercase string reads the same forwards and backwards.
        //       Tip: compare it to a reversed copy of itself.
        for (int i = inputLower.length() - 1; i >= 0; i--){
            inputBack += input.charAt(i);
        }

        if (inputBack.equals(inputLower)){
            System.out.println(input + " is a palindrome.");
        }
        else
            System.out.println(input + " is not a palindrome.");

        // TODO: Treat single-character inputs as palindromes (the above check will already handle this).

        // TODO: Print EXACTLY ONE of the following lines (no extra punctuation/labels):
        //       "<original> is a palindrome"
        //       "<original> is not a palindrome"
        //       where <original> is exactly what the user typed (preserve casing).
    }
}