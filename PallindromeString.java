import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PallindromeString {
    public boolean isPalindrome(char[] str) {
        int start = 0;
        int end = str.length - 1;
        System.out.println("here..");
        System.out.println(end);
        while (start <= end) {
            if (str[start] != str[end]) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        char check = 'Y';
        do {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string for checking palindrome");

            // str
            String str = br.readLine();
            // convert to char array
            char[] ch = str.toCharArray();
            System.out.println("Here");
            System.out.println(ch);
            PallindromeString obj = new PallindromeString();
            boolean ans = obj.isPalindrome(ch);
            if (ans) {
                System.out.println("This string is palindrome" + ans);
            } else {
                System.out.println("This string is not palindrome" + ans);
            }
            System.out.println("Do you want to continue");
            check = (char) br.read();
        } while (check == 'y' || check == 'Y');

    }
}
