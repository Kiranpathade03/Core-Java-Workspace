import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a 1st String ");
        String str1=sc.nextLine();
        System.out.println("Enter a 2st String ");
        String str2=sc.nextLine();


        boolean flag=true;
        if (str1.length()!= str2.length()) {
            System.out.println("String not anagram");
        }
        else{

            int[] arr1=new int[128]; 
            int[] arr2=new int[128]; 
    

           for(int i=0; i<str1.length(); i++){
            arr1[str1.charAt(i)]++;
            arr2[str2.charAt(i)]++;

           }
           for(int i=0; i<arr1.length;i++){
            if (arr1[i]!=arr2[i]) {
                flag=false;
                break;
            }
           }
           if (flag) {
            System.out.println("String is anagraam");
           }else{
            System.out.println("String is not anagram");
           }
        }
    }
}
