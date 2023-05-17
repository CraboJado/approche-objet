package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale ad1= new AdressePostale(1,"rue brumaire",35444,"montpellier");
        AdressePostale ad2= new AdressePostale(1,"rue brumaire",35444,"montpellier");
        Personne per1 = new Personne("kuku","yoyo", ad1);
        Personne per2 = new Personne("bubu","popo", ad2);

        per1.showNameUppercase();
        String name = per1.getName();
        System.out.println(name);
        per1.modifyName("kukuModi");
        System.out.println(per1.getName());

        AdressePostale ad3 = new AdressePostale(3,"rue brumaire3",35444,"montpellier3");
        per1.modifyAddress(ad3);
        System.out.println(per1);

        AdressePostale add = per1.getAddress();
        System.out.println(add);

    }
}
