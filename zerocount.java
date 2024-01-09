import java.util.Scanner;

public class zerocount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Entera a length");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
       int count=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==0) {
                count++;
            }
            
        }
        System.out.println("the 0 is " +count +" Times");
        
    }
}
