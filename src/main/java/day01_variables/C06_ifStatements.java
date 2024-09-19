package day01_variables;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {


        // Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz: ");
        int sayi = input.nextInt();

        int sonuc = sayi % 2;
        if (sonuc == 1) {  // if(sonuc%2==0) da yazabilirdik
            System.out.println("Girilen Sayı tektir");
        } else {
            System.out.println("Girilen Sayı çifttir.");
        }

//Kullanicidan alinan bir sayinin pozitif,
//negatif veya notr oldugunu kontrol eden kodu yaziniz

        System.out.println("Lütfen bir sayı giriniz.");
        double number=input.nextDouble();
        if (number >0 ) {
            System.out.println("Girilen Sayı pozitiftir");
        } else if (number<0) {
            System.out.println("Girilen Sayı negatifir.");
        } else {
            System.out.println("Girilen Sayı sıfırdır4.");
        }


    }
}
