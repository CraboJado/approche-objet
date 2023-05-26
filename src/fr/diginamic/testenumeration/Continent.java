package fr.diginamic.testenumeration;

public enum Continent {
    EUROPE("europe"),
    ASIE("Asie"),
    OCEANIE("Océanie"),
    AFRIQUE("Afrique"),
    AMERIQUE("Amérique");

    String label;

    Continent(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
