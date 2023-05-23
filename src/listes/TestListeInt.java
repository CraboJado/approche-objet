package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(-2);
        list.add(4);
        list.add(8);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //System.out.println(list.size());

        int max = list.get(0);
        for (int i = 1 ; i < list.size() ; i++) {
            if(list.get(i) > max ) max = list.get(i);
        }
        System.out.println(max);

        int min = list.get(0);
        for (int i = 1 ; i < list.size() ; i++) {
            if(list.get(i) < min  ) min  = list.get(i);
        }
        System.out.println(min);

        for (int i = 0 ; i < list.size() ; i++) {
            if(list.get(i) < 0 ) {
                int temp = 0 - list.get(i);
                list.set(i,temp);
            }
        }
        System.out.println(list);

    }
}
