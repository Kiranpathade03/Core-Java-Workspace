//11 Dec 2023

public class String1 {
    public static void main(String[] args) {
       String str1="ABC";
        String str2=new String("ABC");
        System.out.println(str1==str2);

        String str3="ABC";
        String str4=str3;
        System.out.println(str4);
     str3="pqr";
     System.out.println(str3);


        // String str="Codekul";
        // char[] ch=str.toCharArray();
        // System.out.println(ch);
        // for(char i=0; i<=str.length()-1; i++){
        //     System.out.println(ch[i]);
        // }
        String str ="Codekul";
        char[] ch=str.toCharArray();
        System.out.println(ch);

        for(char i=0; i<=str.length()-1; i++){
            System.out.print(ch[i]+" ");
        }


        
    }

}
