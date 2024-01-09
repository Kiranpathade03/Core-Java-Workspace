public class Jack {
    public static void main(String[] args) {
        // int[][] arr = new int[3][];

        // arr[0] = new int[] { 1, 2, 3 };
        // arr[1] = new int[] { 5, 6, 7, 8 };
        // arr[2] = new int[] { 9, 10 };

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // jag array 2
        int[][] arr = new int[3][];
        arr[0] = new int[] { 11, 7, 61, 111 };
        arr[1] = new int[] { 11, 22, 707, 99, 22, 570 };
        arr[2] = new int[] { 98, 77, 778 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //jagged array 3

        int [][] arr2=new int[3][];
        arr2[0]=new int[]{11,22,33,44,55,66,77}; 
        arr2[1]=new int[]{11,23,4,5,66,77}; 
    }
}
