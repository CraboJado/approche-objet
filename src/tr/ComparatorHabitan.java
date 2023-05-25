package tr;

import listes.Ville;

import java.util.Comparator;

public class ComparatorHabitan implements Comparator<Ville> {

    @Override
    public int compare(Ville o1, Ville o2) {
        if( o1.getNumber() > o2.getNumber() ){
            return 1;
        }
        if( o1.getNumber() < o2.getNumber() ){
            return - 1;
        }
        return 0;
    }
}
