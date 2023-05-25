package maps;

import listes.Ville;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {
    public static void main(String[] args) {

        HashMap<String, Ville> map = new HashMap<>();
        Ville ville1 = new Ville("Montpellier", 800200);
        Ville ville2 = new Ville("Lyon", 200300);
        Ville ville3 = new Ville("Lille", 300300);

        map.put(ville1.getName(),ville1);
        map.put(ville2.getName(),ville2);
        map.put(ville3.getName(),ville3);

        Iterator<String> keysIte = map.keySet().iterator();
        long min = map.get(ville1.getName()).getNumber();

        while ((keysIte.hasNext())){
            String targetKey = keysIte.next();
            long targetPopulation = map.get(targetKey).getNumber();
            if(targetPopulation < min) {
                min = targetPopulation;
            }
        }

        Iterator<String> keysIte2 = map.keySet().iterator();
        while ((keysIte2.hasNext())){
            String targetKey = keysIte2.next();
            long targetPopulation = map.get(targetKey).getNumber();
            if(targetPopulation == min) {
                keysIte2.remove();

            }
        }
        System.out.println(map);
    }
}
