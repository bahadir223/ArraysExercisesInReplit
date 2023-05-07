package Arrays;

import java.util.Arrays;

public class Q05 {
    /*
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

    Array: [12,15,43,23,56,76,78,90,77,43]

    Aranan değer:56

    Beklenen Çıktı:

    56 sayısı arrayin 4. elemanı
     */

    public static void main(String[] args) {

        int[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int arananDeger = 56;
        int count = 0;

        for (int w : arr) {

            if (w == arananDeger) {
                System.out.println(w + " sayısı arrayin " + count + ". elemanı");
                break;
            }
            count++;
        }
    }
}
