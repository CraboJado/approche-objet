package listes;

public class Ville implements Comparable<Ville>{
    private String name;
    private double number;

    public Ville(String name, double number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
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
                '}';
    }

}
