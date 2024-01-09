public class ArraySumEvenNumber {
    public static void main(String[] args) {
        int i, sumeven = 0, sumodd = 0, count = 0;

        int[] Arr = { 10, 2, 3, 7, 50, 60, 6 };

        for (i = 0; i <= Arr.length - 1; i++) {
            if (Arr[i] % 2 == 0) {
                sumeven = sumeven + Arr[i];
                System.out.println(i);
                // System.out.println("POstion of Even number :"+count);
                count++;
            } else {
                sumodd = sumodd + Arr[i];
                // System.out.println("POstion of Ody65 number :"+count);
                count++;
            }
        }
        // System.out.println(sumeven);
        // System.out.println(sumodd);
    }
}
