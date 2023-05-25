package entites;

public class Facture {
    private double nbKwh;
    private double montantTTC;
    private double montantHT;

    public Facture(double nbKwh) {
        this.nbKwh = nbKwh;
        this.montantTTC =nbKwh * 0.15;
        this.montantHT = this.montantTTC * 0.8;
    }

    public void addKwh(int nb){
        this.nbKwh += nb;
        this.montantTTC =this.nbKwh * 0.15;
        this.montantHT = this.montantTTC * 0.8;
    }

    public double getNbKwh() {
        return nbKwh;
    }

    public void setNbKwh(double nbKwh) {
        this.nbKwh = nbKwh;
    }

    public double getMontantTTC() {
        return montantTTC;
    }

    public void setMontantTTC(double montantTTC) {
        this.montantTTC = montantTTC;
    }

    public double getMontantHT() {
        return montantHT;
    }

    public void setMontantHT(double montantHT) {
        this.montantHT = montantHT;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "nbKwh=" + nbKwh +
                ", montantTTC=" + montantTTC +
                ", montantHT=" + montantHT +
                '}';
    }
}
