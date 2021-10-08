package _23_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator03 {
    public static void main(String[] args) {
        ArrayList<String> liste=new ArrayList<String>();

        liste.add("A");
        liste.add("B");
        liste.add("C");
        liste.add("D");
        liste.add("E");
        liste.add("F");

        Iterator iterator=liste.iterator();

        System.out.println("Listedeki orjinal kayıtlar");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        ListIterator literator=liste.listIterator();

        // Listeyi modifiye edelim
        while (literator.hasNext()){

            Object obj=literator.next();
            literator.set(obj+" + ");

        }

        System.out.println("list iterator ile düzenlenmiş kayıtlar");
        iterator=liste.iterator();
        while (iterator.hasNext()){

            System.out.print(iterator.next()+ " ");
        }

        System.out.println();


        System.out.println("List iteratör ile geriye doğru düzenlenmiş kayıtlar");

        while (literator.hasPrevious()){

            Object obj=literator.previous();
            System.out.print(obj+" ");
            System.out.print(literator.nextIndex());


        }

    }
}
