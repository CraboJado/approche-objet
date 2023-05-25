package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> listPays =  new ArrayList<>();
        Pays france = new Pays("France",65,"Europe");
        Pays Allemagne = new Pays("Allemagne",80,"Europe");
        Pays Belgique = new Pays("Belgique",10,"Europe");
        Pays Russie = new Pays("Russie",150,"Asie");
        Pays Chine = new Pays("Chine",1400,"Asie");
        Pays Indonésie = new Pays("Indonésie",220,"Océanie");
        Pays Australie = new Pays("Australie",20,"Océanie");
        listPays.add(france);
        listPays.add(Allemagne);
        listPays.add(Belgique);
        listPays.add(Russie);
        listPays.add(Chine);
        listPays.add(Indonésie);
        listPays.add(Australie);

        HashMap<String, Integer> mapPays = new HashMap<>();
        ArrayList<String> continents =  new ArrayList<>();

        for(Pays pay:listPays){
            if(!continents.contains(pay.getContinent())) continents.add(pay.getContinent());
        }

        for(String continent:continents){
            int count = 0;
            for(Pays pay:listPays){
                if(pay.getContinent().equals(continent)){
                    count++;
                }
            }
            mapPays.put(continent,count);
        }

        System.out.println(mapPays);

    }
}
