package Arrays;

import java.util.Arrays;

public class Q07 {
    /*
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

    Array: [1232,2345,5467,678,3454,2312,3451]
     */

    public static void main(String[] args) {

        int[]arr= {1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);

    }
}
