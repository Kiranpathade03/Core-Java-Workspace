import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Row");
        int row = Integer.parseInt(br.readLine());
        System.out.println("Enter a Column");
        int column = Integer.parseInt(br.readLine());

        int[][] Arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for(int i=0; i<row; i++ ){
            for(int j=0; j<column; j++){
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }

    }
}
