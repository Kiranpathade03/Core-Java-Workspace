import java.util.Scanner;

public class GetArraylengthFromUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Length");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
