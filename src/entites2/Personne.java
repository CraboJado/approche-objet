package entites2;

import entites.AdressePostale;

public class Personne {
    public String name;
    //private String name;
    // mauvais pratique , il faut priveriser pour les attributes
    public String firstname;

    public AdressePostale address;

    public Personne(String name, String firstname, AdressePostale address){
        this.name = name;
        this.firstname = firstname;
        this.address = address
        ;
    }

    public void showNameUppercase(){
        System.out.println(name.toUpperCase());
        System.out.println(firstname.toUpperCase());
    }

    public void modifyName (String name){
        this.name = name;
    }

    public void modifyFirstName (String firstname){
        this.firstname = firstname;
    }

    public void modifyAddress (AdressePostale address){
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public AdressePostale getAddress(){
        return this.address;
    }

    @Override
    public String toString() {
        return name +',' + firstname +',' + address ;
    }
}
