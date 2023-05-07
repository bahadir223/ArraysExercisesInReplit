package Arrays;

import java.util.Arrays;

public class Q04 {
    /*
    yazılan değeri array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]

    Aranan Değer:2020

    Beklenen Çıktı:**True**

    Aranan Değer:2010

    Beklenen Çıktı :**False**
     */

    public static void main(String[] args) {

        int[] arr = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

        int arananDeGer = 2020;
        boolean varMi = false;

        for (int w : arr) {
            if (w == arananDeGer) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("**True**");
        } else {
            System.out.println("**False**");
        }


        Arrays.sort(arr);
        int a = Arrays.binarySearch(arr,2010);
        if (a < 0) {
            System.out.println("**False**");

        }else{
            System.out.println("**True**");
        }

    }
}
