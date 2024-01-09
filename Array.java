// 14 Dec 2023

public class Array {
    public static void main(String[] args) {
        // int[] arr={10,20,30,40,50};
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr.length);
        // System.out.println(arr[2]+arr[4]);

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 10, 15 };
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println("length of array :" +arr.length);
        // int sum=0;
        // for(int i=0; i<=arr.length-1; i++){
        // sum=sum+arr[i];

        // }
        // System.out.println(sum);
        int sum = 0, sum1 = 0, count=0;
        for (int i = 0; i <= arr.length - 1; i++) {
            // System.out.println(arr[i]);
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
                System.out.println(arr[i]); 
                // count++; //second way
                // System.out.println(count);//second way

            } else {
                sum1 = sum1 + arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(sum1);

    }
}
