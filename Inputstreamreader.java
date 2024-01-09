// 07 Dec 2023 ********************

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputstreamreader {
    public static void main(String[] args) throws IOException {
        // Sum of two number
        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(IN);

        System.out.println("Enter a value of firsst number :");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println(num1);

        System.out.println("Enter a Second Number :");
        int num2 = Integer.parseInt(br.readLine());
        System.out.println(num2);

        System.out.println("The ans is :" + (num1 + num2));


        System.out.println("ENter a String");
        char str=(char) br.read();
        System.out.println(str);



        
    }
}
