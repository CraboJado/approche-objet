package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Nice");
        list.add("Carcassonne");
        list.add("Narbonne");
        list.add("Lyon");
        list.add("Foix");
        list.add("Pau");
        list.add("Marseille");
        list.add("Tarbes");
        int max = list.get(0).length();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > max ) max = list.get(i).length();
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == max ) System.out.println(list.get(i));;
        }

        for(int i = 0; i < list.size(); i++) {
            String upperCase = list.get(i).toUpperCase();
            list.set(i,upperCase);
        }
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String target = iterator.next();
            if(target.startsWith("N")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
