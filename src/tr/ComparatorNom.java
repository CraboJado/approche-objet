package tr;

import listes.Ville;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {
    @Override
    public int compare(Ville o1,Ville o2){
        int result = o1.getName().compareTo(o2.getName());
        return result;
    }
}
