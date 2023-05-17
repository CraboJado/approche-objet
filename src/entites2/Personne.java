package entites2;

import entites.AdressePostale;

public class Personne {
    public String name;
    public String firstname;

    public AdressePostale address;

    public Personne(String nam, String fn, int snumber, String sname, int cpostal, String cty){
        name = nam;
        firstname = fn;
        address = new AdressePostale(snumber,sname,cpostal,cty);
    }


    @Override
    public String toString() {
        return name +',' + firstname +',' + address ;
    }
}
