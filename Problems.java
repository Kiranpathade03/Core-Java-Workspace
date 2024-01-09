// ***********************************24/11/23**************************************

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        // —----------------------------------------------------------------------------------------------------------------------------
        // *** Program 1: Write a java program to check if a number is even or odd .
        // Input: var=10;
        // Output: 10 is a even no

        // Input: var=37;
        // Output: 37 is a odd no
        // ***Code
        int even = 10;
        if (even % 2 == 0) {
            System.out.println(+even + ": is a Even number");
        } else {
            System.out.println(+even + ": is Odd number");
        }
        // —----------------------------------------------------------------------------------------------------------------------------
        // ***Program 2: Write a java program, take a number and print whether it is
        // less than 10 or greater than 10.
        // Input: var=5
        // Output: 5 Is Less than 10.
        // Input: var=16
        // Output: 16 Is greater than 10.

        int num = 5;
        if (num > 10) {
            System.out.println(+num + ": Is Greter than 10");
        } else {
            System.out.println(+num + ": Is Less than 10");
        }
        // —----------------------------------------------------------------------------------------------------------------------------
        // Program 3: Write a java program, take a character and print whether it is in
        // UPPERCASE or lowercase.
        // Input: var = A
        // Output: You entered UPPERCASE character.
        char var = 'A';
        if ((var >= 65) && (var < 97)) {
            System.out.println(+var + ":is a Uppercase");
        } else {
            System.out.println(+var + " : Is Lowecase");
        }
        // —----------------------------------------------------------------------------------------------------------------------------
        // Program 4: Write a java program, take a number and print whether it is
        // positive or negative.
        // Input: var=5
        // Output: 5 is a positive number

        // Input: var=-9
        // Output: -9 is a negative number
        int positive = -3;
        if (positive > 0) {
            System.out.println(+positive + " : Is Positive number");
        } else {
            System.out.println(+positive + " : Is negative number");
        }
        // —----------------------------------------------------------------------------------------------------------------------------
        // Program 5: Write a java program to check if a character is a vowel or
        // consonant.
        // Input: var=”A”;
        // Output: A is a vowel.

        // Input: var=”D”;
        // Output: D is a consonant.
        // **Code
        char wovels = 'a';
        if ((wovels == 'a' || wovels == 'A') || (wovels == 'E' || wovels == 'e') || (wovels == 'I' || wovels == 'i')
                || (wovels == 'O' || wovels == 'o') || (wovels == 'U' || wovels == 'u')) {
            System.out.println(wovels + ":- Is A Wovel");

        } else {
            System.out.println(wovels + " :- Is not wovels");
        }

        // —----------------------------------------------------------------------------------------------------------------------------

        // Program 6: Write a java program in which take a number from 0 to 5 and print
        // it's spelling,
        // if number is greater than 5 print entered number is greater than 5 (use
        // switch case)
        // Input : var4= 4
        // Output : four
        int spelling = 2;
        switch (spelling) {
            case (1):
                System.out.println("One");
                break;
            case (2):
                System.out.println("Two");
                break;
            case (3):
                System.out.println("Three");
                break;
            case (4):
                System.out.println("Four");
                break;
            case (5):
                System.out.println("Five");
                break;

            default:
                System.out.println("you Entered number is greter than 5");
                break;
        }

        // —----------------------------------------------------------------------------------------------------------------------------

        // Program 7: Write a java program, in which according to month no print the no.
        // of days in that month (use switch case)
        // Input : month = 7
        // Output : July has 31 days
        int month = 2;
        switch (month) {
            case (1):
                System.out.println(" January : 31");
                break;
            case (2):
                System.out.println("February : 29");
                break;
            case (3):
                System.out.println("March : 31");
                break;
            case (4):
                System.out.println("April: 30");
                break;
            case (5):
                System.out.println("May : 31");
                break;
            case (6):
                System.out.println("June : 30");
                break;
            case (7):
                System.out.println("July : 31");
                break;
            case (8):
                System.out.println("August : 31");
                break;
            case (9):
                System.out.println("September : 30");
                break;
            case (10):
                System.out.println("October : 31");
                break;
            case (11):
                System.out.println(" November : 30");
                break;
            case (12):
                System.out.println("December : 31");
                break;

            default:
                System.out.println("Please Valid Month number");
                break;
        }

        // —----------------------------------------------------------------------------------------------------------------------------

        // Program 8: Write a java program, take two characters if these characters are
        // equal then
        // print them as it is but if they are unequal then print their difference.
        // Input: va1=s var2=s
        // Output: va1=s var2=s

        // Input: va1=a var2=p
        // Output: Difference between a and p is 16

        char var1 = 'k';
        char var2 = 's';
        int ans = var2 - var1;
        if (var1 == var2) {
            System.out.println("There are two charactars is Same");
        } else {
            System.out.println("The difference betwn the two char is :" + ans);
        }
        // —----------------------------------------------------------------------------------------------------------------------------

        // Program 9 :
        // write a program to find a maximum between three numbers
        // test cases
        // inputs :
        // 1
        // 2
        // 3
        // output:
        // 3

        // inputs :
        // 1
        // 4
        // 2
        // output:
        // 4
        // ***Code
        int i = 9, j = 2, k = 3;
        if (i > j && i > k) {
            System.out.println(+i + ": is greter");
        } else if (j > i && j > k) {
            System.out.println(+j + ": is greter");
        } else {
            System.out.println(+k + ": is greter");

        }

        // —----------------------------------------------------------------------------------------------------------------------------

        // Program 10 :
        // Calculate profit or loss.
        // Write a program to take cost price and selling price as input (take it
        // hardcoded) and calculate its profit or loss
        // test cases :
        // input:
        // sellingPrice = 1200
        // costPrice = 1000
        // output:
        // profit of 200

        // input:
        // sellingPrice = 300
        // costPrice = 500
        // output:
        // loss of 200
        int sellingPrice = 1200;
        int costPrice = 1000;
        double status = sellingPrice - costPrice;
        if (status > 0) {
            System.out.println("The Profit is :" + status);
        } else if (status < 0) {
            System.out.println("The Loss is :" + status);
        }

        // —----------------------------------------------------------------------------------------------------------------------------

        // Program 11:
        // Write a program in java to accept three numbers and check whether they are
        // Pythagorean triplets or not
        // example (what is pythagorean triplet):
        // a=3,b=4,c=5
        // if
        // a*a+b*b=c*c
        // then
        // its pythagorean triplet
        // else
        // not a Pythagorean triplet

        // test cases:
        // 1.
        // input:
        // a=3,b=4,c=5

        // output
        // triplet

        // 2.
        // input:
        // a=1, b=6,c=9
        // output
        // not a triplet
        // ***Code
        int a = 3, b = 4, c = 5;
        if (a * a + b * b == c * c) {
            System.out.println("its pythagorean triplet");
        } else {
            System.out.println("its not pythagorean triplet");
        }

        // —----------------------------------------------------------------------------------------------------------------------------

        // Program 12:
        // Write a program to input week number(1-7) and print the corresponding day of
        // week name
        // test case
        // 1.
        // input:
        // 1
        // output:
        // Monday

        // 2.
        // input:
        // 6
        // output:
        // Saturday

        int day = 2;
        switch (day) {
            case (1):
                System.out.println("The Day is :- Monday");
                break;
            case (2):
                System.out.println("The Day is :- Tuesday");
                break;
            case (3):
                System.out.println("The Day is :- Wednusday");
                break;
            case (4):
                System.out.println("The Day is :- Thursday");
                break;
            case (5):
                System.out.println("The Day is :- Friday");
                break;
            case (6):
                System.out.println("The Day is :- Saturday");
                break;
            case (7):
                System.out.println("The Day is :- Sunday");
                break;

        }

        // —----------------------------------------------------------------------------------------------------------------------------

        // Program 13:
        // Hello shinobi's, I am Naruto Uzumaki. I am stuck in this code. Please, I want
        // help from you guys, believe it!
        // the code problem statement is :
        // Here are levels of ninja down with their points range :
        // 1. Genin: range from points 0-100
        // 2. Chunin: range from points 100-500
        // 3. Jonin: range from points 500-1000
        // 4. Hokage: range from points above 1000
        // take points as input and determine at which level of a ninja I am right now,
        // believe it!
        // test case:
        // 1.
        // input:
        // 4
        // output:
        // Genin

        // 2.
        // input:
        // 600
        // output:
        // Jonin

        // 3.
        // input:
        // 5000
        // output:
        // Hokage

        // —----------------------------------------------------------------------------------------------------------------------------

        // Solve these codes using switch case and using if else
        // Q1
        // Write a program in which students should enter marks of 5 different subjects.
        // If all subject
        // having above passing marks add them and provide to switch case to print
        // grades(first class
        // second class), if student get fail in any subject program should print “You
        // failed in exam”

        // —----------------------------------------------------------------------------------------------------------------------------

        // Q2.
        // Write a program in which ask the user to enter a number from 0 to 5 and print
        // it's spelling,if the
        // entered number is greater than 5 print entered number is greater than 5 (use
        // if else or switch
        // case)
        // e.g
        // Input -Enter a number - 4
        // Output - four

        Scanner Getnumber = new Scanner(System.in);

        System.out.print("Enter a Number :");
        int Number = Getnumber.nextInt();
        switch (Number) {
            case (0):
                System.out.println("Zero");
                break;
            case (1):
                System.out.println("One");
                break;
            case (2):
                System.out.println("Two");
                break;
            case (3):
                System.out.println("Three");
                break;
            case (4):
                System.out.println("Four");
                break;
            case (5):
                System.out.println("Five");
                break;

            default:
                System.out.println("Entered Number is greter than five");
                break;
        }
        // —----------------------------------------------------------------------------------------------------------------------------

        // Q3
        // Write a program in which user should enter two numbers if both the numbers
        // are positive
        // multiply them and provide to switch case to verify number is even or odd, if
        // user enters any
        // negative number program should terminate saying “Sorry negative numbers not
        // allowed”
         Scanner Getnumber2 = new Scanner(System.in);

         System.out.println("Enter a first number:");

        // —----------------------------------------------------------------------------------------------------------------------------

        // Q4
        // Take choice from user
        // Show this to user
        // What's your interest?
        // 1.movies
        // 2.Series
        // Enter your choice :
        // If user enters 1 :
        // Movie you wish to watch today
        // 1.Founder
        // 2. Snowden
        // 3.Jobs
        // 4.Her
        // 5.Social Network
        // 6.Wall-E
        // 7.AI
        // If user enters 2 :
        // Best series to watch
        // 1.Silicon vally
        // 2.Devs
        // 3.the IT crowd
        // 4.Mr Robot
        // Print users choice

        // —----------------------------------------------------------------------------------------------------------------------------

        // 5. Write a real time time example which shows a index like above code
    }

    // Program 5: Write a java program to check if a character is a vowel or
 
}
