import java.util.Scanner;

public class ThreeDArray {
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
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    System.out.println("Enter a Element");
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
        // Print the sum of planes
        int sum = 0;
        for (int i = 0; i < plane; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    System.out.print(Arr[i][j][k]);
                    sum = sum + Arr[i][j][k];
                }
                System.out.println();
            }

            System.out.println("the sum of plane is : " + sum);
            sum = 0;
        }

    }
}
