import java.util.Scanner;

public class Methods1 {

    void printnumber(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

    static void even(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is Even number");
        } else {
            System.out.println("Number is not Even number");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        do {
            System.out.println("Enter a number");
            int number = sc.nextInt();
            Methods1.even(number); // method calling........
            System.out.println("Enter a Number you want to print till the end");
            int number2 = sc.nextInt();

            Methods1 obj = new Methods1();

            obj.printnumber(number2);

            System.out.println(" Do You want to repeat it");
            ch = sc.next().charAt(0);

        } while ((ch == 'y') || (ch == 'Y'));

    }
}
