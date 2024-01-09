//28 Nov **************************
class forloop2 {
    public static void main(String[] args) {
        // table*************
        // int i, j;
        // for (i = 1; i <= 10; i++) {

        // for (j = 1; j <= 10; j++) {
        // System.out.print(" "+i * j);
        // }
        // System.out.println();
        // }

        // in table even numbber adddtion *************
        // int i,no=19;
        // int sum=0;
        // for (i = 0; i <= 10; i++) {
        // int ans=i*no;
        // if (ans%2==0) {

        // sum=sum+ans;

        // }
        // }
        // System.out.println(sum);

        // Factorial Number***********
        int i, j;
        int sum = 1;
        int n=5;
        for (i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);

    }
}