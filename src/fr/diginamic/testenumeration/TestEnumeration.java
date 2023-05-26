package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {

        Saison[] seasons = Saison.values();

        for (Saison s:seasons
             ) {
            System.out.println(s);
        }

        String nom = "ETE";
        Saison season = Saison.valueOf(nom);
        System.out.println(season);
        System.out.println(season.getName());

        Saison s = Saison.getInstance("Automne");
        System.out.println(s);
    }
}
