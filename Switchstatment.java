 

public class Switchstatment {
    public static void main(String args[]) {
        int age = 5;

        switch (age) {

            case (1):
                System.out.println("age is 1");
                break;
            case (2):
                System.out.println("age is 2");
                break;
            case (3):
                System.out.println("age is 3");
                break;
            case (4):
                System.out.println("age is 4");
                break;
            case (5): {
                Sum(10, 20);
                break;
            }
            case (6):
                System.out.println("age is 6");
                break;
            case (7):
                System.out.println("age is 7");
                break;
            case (8):
                System.out.println("age is 8");
                break;
            case (10):
                System.out.println("age is 10");
                break;
            case (11):
                System.out.println("age is 11");
                break;
            case (12):
                System.out.println("age is 12");
                break;
            case (13):
                System.out.println("age is 13");
                break;
            case (14):
                System.out.println("age is 14");
                break;
            case (15):
                System.out.println("age is 15");
                break;
            case (16):
                System.out.println("age is 16");
                break;
            case (17):
                System.out.println("age is 9");
                break;
            case (18):
                System.out.println("age is 18");
                break;

            default:
                System.out.println("Can't find conditon");

        }
    }

    static void Sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

}
