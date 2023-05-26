package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps",1),
    ETE("Eté",2),
    AUTOMNE("Automne",3),
    HIVER("Hiver",4);

    private String name;
    private int order;
    Saison(String name,int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Saison getInstance (String label){
        Saison[] seasons = Saison.values();
        Saison sTarget = null;
        for (Saison s:seasons ) {
            if(s.getName().equals(label)){
                sTarget = s;
            }
        }
        return  sTarget;
    }
}
