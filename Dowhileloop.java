import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        do {
            System.out.println("Enter a first value");
            int fvalue = sc.nextInt();

            System.out.println("Enter a first value");
            int svalue = sc.nextInt();

            int Ans = fvalue + svalue;
            System.out.println(Ans);

            System.out.println("do you want to continue");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

    }
}
