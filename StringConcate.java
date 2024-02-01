import java.util.Scanner;

/**
 * StringConcate
 */
public class StringConcate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 1st String");
        String str1 = sc.nextLine();

        System.out.println("Enter a 2nd String");
        String str2 = sc.nextLine();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;

        while (i < arr1.length || j < arr2.length) {
            if (i < arr1.length) {
                result.append(arr1[i]);
                i++;
            }
            if (j < arr2.length) {
                result.append(arr2[j]);
                j++;
            }
        }
        System.out.println(result);

    }
}