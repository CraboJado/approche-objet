package fr.diginamic.essais;

import entites.Facture;

public class TestFacture {
    public static void main(String[] args) {
        Facture myFacture = new Facture(200);
        System.out.println(myFacture);
        myFacture.addKwh(200);
        System.out.println(myFacture);
    }
}
