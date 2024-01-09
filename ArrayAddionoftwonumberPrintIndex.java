public class ArrayAddionoftwonumberPrintIndex {
 
    public static void main(String[] args) {
        int i, j;
        int[] Ans = { 0, 0 };
        int[] Arr = { 2, 5, 6, 10, 8 };

        for (i = 0; i <= Arr.length - 1; i++) {
            for (j = i; j <= Arr.length - 1; j++) {
                if (Arr[i] + Arr[j] == 15) {
                    Ans[0] = i;
                    Ans[1] = j;
                    // // System.out.println(Ans[0]);
                    // // System.out.println(Ans[1]);
                    // System.out.println(i);
                    // System.out.println(j);
                }
               
            }
        }
        for(i=0; i<Ans.length; i++){
            System.out.print(Ans[i]);
        }
    }
}
