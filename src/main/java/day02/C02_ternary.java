package day02;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        /*
Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
Sesli harfler: a,e,i,o,u
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kontrol etmek istediğiniz değeri giriniz: ");
        String harf= input.next().toLowerCase();   //Kullanıcı küçük harf de girse büyük de hepsini büyütüyorum.

        harf= harf.replaceAll("[^a-z]", "^");//Kullanıcı harf dışında bir karakter girerse bunu ^ ya dönüştür.
        //?, /,
        harf=harf.replaceAll("[aeiou]", "e"); //5 harfi de e harfine atadım.

        if (harf.contains("^")||harf.length()>1){
            System.out.println("Hatalıdır");
        }else {
            if (harf.equals("e")){
                System.out.println("Sesli harftir");
            }else {
                System.out.println("Sessiz harftir");
            }
        }

        String str=harf.contains("^")||harf.length()>1?("Hatalıdır!"):(harf.equals("e")?"Sesli harftir":"Sessiz harftir");


    }
}
