public class FrequencyOFArrayElement {
    public static void main(String[] args) {


        int number=1253653847 , remainder;

        int [] Arr=new int[10];

        while (number!=0) {
            remainder=number%10;
            Arr[remainder]++;
            number=number/10;

        }
        for( int i=0; i<Arr.length;i++ ){
            System.out.println("the Frequency of "+i+" is :"+Arr[i]);
        }

    }

}
