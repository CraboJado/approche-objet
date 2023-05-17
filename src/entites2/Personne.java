package entites2;

import entites.AdressePostale;

public class Personne {
    public String name;
    public String firstname;

    public AdressePostale address;

    public Personne(String name, String firstname, AdressePostale address){
        this.name = name;
        this.firstname = firstname;
        this.address = address
        ;
    }


    @Override
    public String toString() {
        return name +',' + firstname +',' + address ;
    }
}
