package day02;


import java.util.Scanner;

public class C06_Odev {
    public static void main(String[] args) {
        /*
Bir String' de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız
*/

        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz.");
        String text=input.nextLine();
        int length = text.length();

        // Dış döngü ile her karakteri kontrol ediyoruz
        for (int i = 0; i < length; i++) {
            char karakter = text.charAt(i);
            boolean benzersiz = true;  // Her karakteri benzersiz olarak varsayıyoruz

            // İç döngü ile karakterin tekrar olup olmadığını kontrol ediyoruz
            for (int j = 0; j < length; j++) {
                if (i != j && karakter == text.charAt(j)) {
                    benzersiz = false;  // Eğer karakter tekrar ediyorsa benzersiz değil
                    break;  // Aynı karakter bulunduğunda daha fazla kontrol etmeye gerek yok
                }
            }

            // Eğer karakter benzersizse yazdır
            if (benzersiz) {
                System.out.print(karakter + " ");
            }
        }

        //2.yol
        // Dış döngü ile her karakteri kontrol ediyoruz
        for (int i = 0; i < length; i++) {
            char karakter = text.charAt(i);
            int sayac = 0;  // Her karakter için sayacı sıfırlıyoruz

            // İç döngü ile karakterin kaç kez tekrarlandığını kontrol ediyoruz
            for (int j = 0; j < length; j++) {
                if (karakter == text.charAt(j)) {
                    sayac++;  // Eğer aynı karakteri bulursak sayacı artırıyoruz
                }
            }

            // Eğer sayaç 1 ise, karakter benzersizdir
            if (sayac == 1) {
                System.out.print(karakter + " ");
            }
        }
    }
}
