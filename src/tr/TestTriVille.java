package tr;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;

public class TestTriVille {
    public static void main(String[] args) {
        ArrayList<Ville> list = new ArrayList<>();
        list.add(new Ville("Nice", 343000, Continent.EUROPE));
        list.add(new Ville("Carcassonne", 47800, Continent.EUROPE));
        list.add(new Ville("Narbonne", 53400, Continent.EUROPE));
        list.add(new Ville("Lyon", 484000, Continent.EUROPE));
        list.add(new Ville("Foix", 9700, Continent.EUROPE));
        list.add(new Ville("Pau", 77200, Continent.EUROPE));
        list.add(new Ville("Marseille", 850700, Continent.EUROPE));
        list.add(new Ville("Tarbes", 40600, Continent.EUROPE));

        Collections.sort(list);

        for(Ville ele: list){
            System.out.println("sort avec implement comparable: " + ele);
        }

        Collections.sort(list, new ComparatorHabitan());
        for(Ville ele: list){
            System.out.println("sort avec ComparatorHabitan: " +ele);
        }

        Collections.sort(list, new ComparatorNom());
        for(Ville ele: list){
            System.out.println("sort avec ComparatorNom: " + ele);
        }
    }
}
