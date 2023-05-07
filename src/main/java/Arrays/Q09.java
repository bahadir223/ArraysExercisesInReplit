package Arrays;

import java.util.Scanner;

public class Q09 {
    /*

     */

    public static void main(String[] args) {


        long binary1, binary2;

        Scanner ink = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz.");
        binary1 = ink.nextLong();
        System.out.println("ikinci sayiyi giriniz.");
        binary2 = ink.nextLong();
        long toplam = 0;


        long bn1 = Integer.parseInt(String.valueOf(binary1),2);
        long bn2 = Integer.parseInt(String.valueOf(binary2),2);

        toplam = bn1 + bn2;

        System.out.println(Long.toBinaryString(toplam));


    }
}
