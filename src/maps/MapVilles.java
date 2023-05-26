package maps;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {
    public static void main(String[] args) {

        HashMap<String, Ville> map = new HashMap<>();
        Ville ville1 = new Ville("Montpellier", 800200, Continent.EUROPE);
        Ville ville2 = new Ville("Lyon", 200300, Continent.EUROPE);
        Ville ville3 = new Ville("Lille", 100300, Continent.EUROPE);

        map.put(ville1.getName(),ville1);
        map.put(ville2.getName(),ville2);
        map.put(ville3.getName(),ville3);

        Iterator<String> keysIte = map.keySet().iterator();
        long min = map.get(ville1.getName()).getNumber();
        String key =ville1.getName();

        while ((keysIte.hasNext())){
            String targetKey = keysIte.next();
            long targetPopulation = map.get(targetKey).getNumber();
            if(targetPopulation < min) {
                min = targetPopulation;
                key = targetKey;
            }
        }

//        Iterator<String> keysIte2 = map.keySet().iterator();
//        while ((keysIte2.hasNext())){
//            String targetKey = keysIte2.next();
//            long targetPopulation = map.get(targetKey).getNumber();
//            if(targetPopulation == min) {
//                keysIte2.remove();
//            }
//        }
//        String targetKey = "";
//        for (String ele : map.keySet()) {
//            if(map.get(ele).getNumber() == min) targetKey = ele;
//        }

        map.remove(key);
        System.out.println(map);
    }
}
