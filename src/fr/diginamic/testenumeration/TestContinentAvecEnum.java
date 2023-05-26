package fr.diginamic.testenumeration;

import listes.Ville;

import java.util.ArrayList;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        ArrayList<Ville> listVilles = new ArrayList<>();
        listVilles.add(new Ville("New York", 343000, Continent.AMERIQUE));
        listVilles.add(new Ville("Paris", 343000, Continent.EUROPE));
        listVilles.add(new Ville("Pékin", 343000, Continent.ASIE));
        listVilles.add(new Ville("Moscou", 343000, Continent.ASIE));
        listVilles.add(new Ville("Berlin", 343000, Continent.EUROPE));
        listVilles.add(new Ville("Sydney", 343000, Continent.OCEANIE));
        listVilles.add(new Ville("Sydney", 343000, Continent.OCEANIE));
        listVilles.add(new Ville("Sao Paulo", 343000, Continent.AMERIQUE));
        listVilles.add(new Ville("Dakar", 343000, Continent.AFRIQUE));

        for (Ville v:listVilles
             ) {
            System.out.println(v.getContinent().getLabel());
        }
    }
}
