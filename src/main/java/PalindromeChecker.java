import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word:");
        String input = sc.nextLine();

        String inputLower = input.toLowerCase();
        String inputBack = "";
        for (int i = inputLower.length() - 1; i >= 0; i--){
            inputBack += inputLower.charAt(i);
        }

        if (inputBack.equals(inputLower)){
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}