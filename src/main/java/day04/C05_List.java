package day04;

import java.util.ArrayList;

public class C05_List {
    public static void main(String[] args) {
        /*
        Bir list oluşturup eleman ekleyin ve yazdırın.
        */

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(9);
        myList.add(11);
        myList.add(13);
        myList.add(15);
        System.out.println(myList); //[3, 5, 7, 9, 11, 13, 15]
        myList.add(5,12);
        System.out.println(myList);  //[3, 5, 7, 9, 11, 12, 13, 15]
    }
}
