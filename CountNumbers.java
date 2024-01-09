public class CountNumbers {

    public static void main(String[] args) {
        int num1 = 12056654;
        int num2 = 2;
        int count = 0;

        while (num1 != 0) {
            int remainder = num1 % 10;
            num1 /= 10; // Update num1 to remove the last digit
            count++;
        }

        while (num2 != 0) {
          
            int remainer2 = num2 % 10;
            num2 = num2 / 10;
            count++;
        }

        System.out.println("Number of digits in num1 +num2 : " + count);
    }
}
