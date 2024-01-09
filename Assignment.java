
class Assignment {

    // Program 1: Write a code to calculate following operation between two numbers

    // 1)Addition

    // 2) Subtraction
    // 3) Multiplication

    // 4)Division

    // 5) Modulus

    // Every operation should carried out in a separate method

    static void Add() {
        int a = 20;
        int b = 10;
        int add = a + b;
        System.out.println("The addtion of two nummbers is :" + add);
    }

    static void Sub() {
        int a = 20;
        int b = 10;
        int sub = a - b;
        System.out.println("The Substraction of two numbers is :" + sub);
    }

    static void Mul() {
        int a = 20;
        int b = 10;
        int Mul = a * b;
        System.out.println("The Multiplication  of two numbers is :" + Mul);
    }

    static void Division() {
        int a = 20;
        int b = 10;
        int div = a - b;
        System.out.println("The Division of two numbers is :" + div);
    }

    static void Modulus() {
        int a = 20;
        int b = 10;
        int Modulus = a % b;
        System.out.println("The Division of two numbers is :" + Modulus);
    }

    // Program 2: What will be output for following statement when a=10 and b=20 c =
    // 50 a+++ +++ ++c ?
    // Ans- 82

    // Program 3: What will be output for following statement when a=10 and b=20 c =
    // 50 --a+++b+c--?
    // Ans-80

    // Program 4: What will be output for following statement when a=10 and b=20 c =
    // 50 a+++--b + c--?
    // Ans-79

    // Program 5: Write a Java Program, which will contain 2 numbers. Use the
    // following operators on it.

    // 1. less than (<)
    // 2. Greater than (>)

    // 3. Less than or equal to (<=))
    // 4. Greater than or equal to (>=)

    // 5. Equivalent (=)

    // 6. Not equivalent (!=)

    static void Program5() {
        System.out.println("Less Than :" + (5 < 4));
        System.out.println("Less Than :" + (5 > 4));
        System.out.println("Less Than :" + (5 <= 4));
        System.out.println("Less Than :" + (5 >= 4));
        System.out.println("Less Than :" + (5 != 4));
    }

    // Program 6: Write a Java Program, which will contain one number 'num'. Use the
    // following operators on it and print the output.

    // 1. num >>>= 2

    // 2. num <<= 3

    // 3. num = 2

    // 4. num = ++num

    // 5. num = num

    static void Program6() {
        int num = 10;
        System.out.println(num >>>= 2);
        System.out.println(num <<= 2);
        System.out.println(num = 2);
        System.out.println(num = ++num);
        System.out.println(num = num);
    }

    // Program 7: What will be the output of the statement if i=5, j=4

    // 1. (i++ >= j++) && (j < i++)

    // 2. (ij) || (j++ >= ++i)

    static void Program7() {
        int i = 5, j = 4;
        System.out.println("1." + (i++ >= j++ && j < i++));
        System.out.println("2." + (--i < j-- || j++ >= ++i));
    }

    public static void main(String args[]) {
        // Add();
        // Sub();
        // Mul();
        // Division();
        // Modulus();
        // Program5();
        // Program6();
        Program7();
        // int a=20 , b=20, c = 50;
        // System.out.println(a++ + ++b + ++c);
        // System.out.println(--a + ++b + c--);
        // System.out.println(a-- + a--);
    }
}