import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetArrayElementFromUser {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Length of array");
        int length=Integer.parseInt(br.readLine());
        int[] Arr=new int[length];
        System.out.println("Enter a Element");
        for(int i=0; i<Arr.length; i++){
        
            Arr[i]=Integer.parseInt(br.readLine());
        }
        
        for(int j=0; j<Arr.length; j++){
            System.out.print(Arr[j] +" ");
        }
    }
}
