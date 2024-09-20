package day02;


import java.util.Scanner;

public class C05_forloops {
    public static void main(String[] args) {

        /* Kullanicidan 100'den kucuk bir pozitif tamsayi isteyin.
1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
*/
        Scanner input=new Scanner(System.in);
        byte sayi1=input.nextByte();
        if(sayi1<0 || sayi1>100){
            System.out.println("Lütfen 100'den küçük bir tam sayı giriniz:");
        }else{
            for (int i = 1; i <=sayi1 ; i++) {
                if(i%3==0){
                    System.out.print(i+" ");
                }
            }
        }

    }
}
