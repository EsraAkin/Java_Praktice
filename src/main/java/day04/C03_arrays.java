package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
        /*
        3.soru Verilen array
        in tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin. Ornek; array ((1,2,3,4,5)) ise output (2, 3,4,5, 1) olacak
        */

        int[] array = {1, 2, 3, 4, 5};
        int temp = array[0];     //Arrayin 1 elemanını almak istiyorsam bunu kullan. Burda 0. index elemanını aldım.yani 1'itutar
        //*****ne zaman for, ne zaman foreach? indexle işimiz varsa for, yoksa for each kullanılır.
        //Eleman sayısı değişiyorsa yine for döngüsü kullanılır.

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            System.out.println(Arrays.toString(array));
        }
//son indexe yani array.length-1 e elimde tuttuğum tempi atayacağım.

        array[array.length - 1] = temp;
        System.out.println(Arrays.toString(array));


    }
}
