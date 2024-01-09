import java.util.Scanner;

public class ThreeDArrayprintEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Plane");
        int plane = sc.nextInt();
        System.out.println("Enter a Row");
        int row = sc.nextInt();
        System.out.println("Enter a Column");
        int col = sc.nextInt();

        int[][][] Arr = new int[plane][row][col];
        // Get value of 3D array from user
        for (int i = 0; i < plane; i++) {
            System.out.println("Enter a Element");
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    Arr[i][j][k] = sc.nextInt();
                }

            }

        }
        // Print the 3D array
        for (int i = 0; i < plane; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    System.out.print(Arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        int sum = 0, Even=0;

        // Print Even Numbers in the 3D array
        for (int i = 0; i < plane; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if (Arr[i][j][k] % 2 == 0) {
                        Even = Arr[i][j][k];
                    }
                }
                System.out.println("the  Even number is" + Even +" ");
                System.out.println();
            }
            System.out.println();
        }

        // Print sum of Even Numbers in the 3D array
        for (int i = 0; i < plane; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if (Arr[i][j][k] % 2 == 0) {
                        sum = sum + Arr[i][j][k];
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the sum Even number is" + sum);

    }
}
