package Arrays;

public class Q06 {
    /*
    Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:

    Tek Sayilar: 5

    Cift Sayilar: 4

     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tek = 0;
        int cift = 0;

        for (int w : arr) {
            if (w % 2 != 0) {
                tek++;
            } else {
                cift++;
            }

        }
        System.out.println(tek);
        System.out.println(cift);
    }
}
