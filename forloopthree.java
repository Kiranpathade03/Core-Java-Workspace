//29 Nov ********************
public class forloopthree {
  public static void main(String[] args) {
    // for(int i=100000; i<=200000; i++){
    // if (i%111==0) {
    // System.out.println(i);
    // }
    // }

    // Shape***********
    // for(int i=1; i<=5; i++){
    // for(int j=1; j<=5; j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // Reverse number***************
    int n = 123, remainder, rn = 0;
    while (n != 0) {

      remainder = n % 10;
      System.out.println(remainder);
      rn = rn * 10 + remainder;
      System.out.println(rn);
      n = n / 10;
      System.out.println(n);

    }
    System.out.println(rn);
  }
}
