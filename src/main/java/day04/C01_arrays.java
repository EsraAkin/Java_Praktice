package day04;

import java.util.Arrays;

public class C01_arrays {
    public static void main(String[] args) {
        /*
1.soru bir array olusturun ve olusturdugunuz arraydeki tum elemanları yazdırın
 */
        //gireceğimiz datayi yazalım.
        String[] isimler={"Ali Can","Muhammet","Sinan","Esra","Kerim","Tuba",};
        System.out.println(Arrays.toString(isimler));    //Arrays bir classtır.
        // Array kullanımını kolaylaştırmak için üretilmiştir. Array ise bir yapıdır.
        //Arrays.toString() metodu olmadan for each kullanarak yazdırırım.
        //mesela
        for (String a:isimler)
        {
            System.out.print(a+",");
        }



    }
}
