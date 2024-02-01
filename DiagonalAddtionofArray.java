import java.util.Scanner;

public class DiagonalAddtionofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a length of array");
        int length=sc.nextInt();
        int [][] arr=new int[length][length];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter a element");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //diagonal
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
               if (arr[i]==arr[j]) {
                sum=sum+arr[i][j];
               }
            }
        }
        System.out.println(sum);

    }
}
