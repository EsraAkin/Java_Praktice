package day04;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_List {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
// bir method olusturun
// orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
//       [1, 3, 5, 6, 7] bu hale donusturun

        ArrayList<Integer>myList=new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));

        //asList olarqk oluşturdum ve ArrayListe dönüştürdüm.
        System.out.println(myList);  //[1, 3, 5, 3, 5, 6, 1, 7]
        myList.add(9);
        System.out.println(myList);  //[1, 3, 5, 3, 5, 6, 1, 7, 9]

        tekrarsizList(myList);
        //

    }

    private static void tekrarsizList(ArrayList<Integer>myList){
        ArrayList<Integer>tekrarsizList=new ArrayList<>();
        //boş bir Array oluştur. Ona atayacam.
        for (Integer a :myList) {
            if (!tekrarsizList.contains(a)){
                tekrarsizList.add(a);
            }else {
                System.out.println("Bu sayıdan birden fazla var : "+a);
            }
        }
        System.out.println(tekrarsizList);  //[1, 3, 5, 6, 7, 9]
    }

}
