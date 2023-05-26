package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville>{
    private String name;
    private long number;

    private Continent continent;

    public Ville(String name, long number , Continent continent) {
        this.name = name;
        this.number = number;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public int compareTo(Ville autre) {
        if(this.number > autre.getNumber()){
            return 1;
        }
        if(this.number < autre.getNumber()){
            return - 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", continent =" + continent +
                '}';
    }

}
