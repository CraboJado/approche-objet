package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale ad1= new AdressePostale(1,"rue brumaire",35444,"montpellier");
        AdressePostale ad2= new AdressePostale(1,"rue brumaire",35444,"montpellier");
        Personne per1 = new Personne("kuku","yoyo", ad1);
        Personne per2 = new Personne("bubu","popo", ad2);

        System.out.println(per1);

    }
}
