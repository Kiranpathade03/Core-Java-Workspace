//20 Dec 2023
public class FindAPeak {
    public static void main(String[] args) {
        int [] Array={11,98,222,99,111,102,107,150,77,99};

        for(int i=1; i<Array.length-1; i++){
            if ((Array[i-1]<Array[i] )&&(Array[i+1]<Array[i]) ) {
                System.out.println("Peak mount is"+Array[i]);
            }
          
        }
    }
}
