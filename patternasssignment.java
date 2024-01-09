// 30 Nov **************
public class patternasssignment {
    public static void main(String[] args) {
        int i, j;
        // pattern 1 ***********
        // 1234
        // 1234
        // 1234
        // 1234

        // for (i = 1; i <= 4; i++) {
        // for (j = 2; j <= 5; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // pattern 2**************
        // int n = 3;
        // for ( i = 1; i <= 3; i++) {
        // for ( j = 1; j <= n; j++) {
        // int number = (i - 1) * n + j;

        // System.out.print(number);

        // }
        // System.out.println();
        // }
        // pattern 3************
        // 1212
        // 1212
        // 1212
        // for (i = 1; i <= 4; i++) {
        // for (j = 1; j <= 4; j++) {
        // if (j%2==0) {
        // System.out.print(2+"");

        // }else{
        // System.out.print(1+"");
        // }

        // }
        // System.out.println();
        // }
        // pattern 3************
        // 1111
        // 2222
        // 1111
        // 2222
        // for (i = 1; i <= 4; i++) {

        // for (j = 1; j <= 4; j++) {
        // if (j%2==0) {
        // System.out.println("1111");
        // }
        // else{
        // System.out.println("2222");
        // }

        // }
        // System.out.println();
        // }
        // pattern 3************
        // 1111
        // 2222
        // 1111
        // 2222
        int start = 1;
        int sum = 0;
        for (i = 1; i <= 4; i++) {

            for (j = 1; j <= 4; j++) {
                int finalans =start + start;
                System.out.print(finalans + " ");
                sum=sum+finalans;
        
                start++;
            }
             System.out.println(sum);
            System.out.println();
            sum=0;
           
        }
    }
}
