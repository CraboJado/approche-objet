package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> list = new ArrayList<>();
        list.add(new Ville("Nice", 343000));
        list.add(new Ville("Carcassonne", 47800));
        list.add(new Ville("Narbonne", 53400));
        list.add(new Ville("Lyon", 484000));
        list.add(new Ville("Foix", 9700));
        list.add(new Ville("Pau", 77200));
        list.add(new Ville("Marseille", 850700));
        list.add(new Ville("Tarbes", 40600));

        double max = list.get(0).getNumber();
        double min = list.get(0).getNumber();
        Iterator<Ville> iterator = list.iterator();
        while(iterator.hasNext()){
            Ville target = iterator.next();
            if(target.getNumber() > max ) max = target.getNumber();
            if(target.getNumber() < min ) min = target.getNumber();
        }

        Iterator<Ville> iterator2 = list.iterator();
        while(iterator2.hasNext()){
            Ville target = iterator2.next();
            if(target.getNumber() == max ) System.out.println(target.getName());
            if(target.getNumber() == min ) iterator2.remove();
            if(target.getNumber() > 100000) {
                String upperCaseCity = target.getName().toUpperCase();
                target.setName(upperCaseCity);
            }

        }
        System.out.println(list);
    }
}
