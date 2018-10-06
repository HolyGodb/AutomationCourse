import java.util.Scanner;

public class main {
    public static boolean IsPalindrome(String word) {
        char[] wordInCharArray = word.toCharArray();
        boolean isPalindrome = false;
        for (int i = 0; i < wordInCharArray.length / 2; i++) {
            if (wordInCharArray[i] == wordInCharArray[wordInCharArray.length - i - 1]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the word you wanna check:");
        String enteredWord = in.nextLine();

        System.out.println("Is the entered word palindrome: " + IsPalindrome(enteredWord));
    }
}
