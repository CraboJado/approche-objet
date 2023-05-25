package entites;

public class Cercle {
    private  double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double Circumference (){
        return 2*3.14*this.rayon;
    }

    public double area(){
        return 3.14*this.rayon*this.rayon;
    }


    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
