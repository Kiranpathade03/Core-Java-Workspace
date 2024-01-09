//20 Dec 2023

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Row");
        int x = sc.nextInt();
        System.out.println("Enter a colounm");
        int y = sc.nextInt();

        int[][] Arr = new int[x][y];

        int sum = 0;
        // get Array input from user

        for (int i = 0; i < Arr.length; i++) {

            for (int j = 0; j < Arr.length; j++) {
                Arr[i][j] = sc.nextInt();
            }

        }
        // print the 2D Array

        // for (int i = 0; i < x; i++) {
        // for (int j = 0; j < y; j++) {
        // System.out.print(Arr[i][j]);

        // }
        // System.out.print(" "+sum);

        // System.out.println();

        // }

        // Print the sum of row

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(Arr[i][j]);

                sum = sum + Arr[i][j];
            }
            System.out.print(" " + sum);
            sum = 0;
            System.out.println();

        }

        // //Print the sum of coloumn
        // int count=0;
        // for(int i=0; i<x; i++){
        // for(int j=0; j<y; j++){
        // System.out.println(Arr[i][j]);

        // count=count+Arr[i][j];
        // }

        // }

        // Coloumn sum

        // for (int i = 0; i < y; i++) {
        // for (int j = 0; j < x; j++) {
        // System.out.print(Arr[i][j]);

        // sum=sum+Arr[i][j];
        // }
        // System.out.print(" "+sum);
        // sum=0;
        // System.out.println();

        // }

    }
}
