//08 Dec 2023
import java.util.Scanner;

public class scannermethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range");
        int start = sc.nextInt();
        int end=sc.nextInt();
        int i , sum=0;
        for(i=start; i<=end; i++){
            if (i%2==0) {
                 sum=sum+i;

            }
        }
        System.out.println(sum);

    }
}
