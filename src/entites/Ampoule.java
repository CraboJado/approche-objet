package entites;

public class Ampoule {
    private boolean status;

    public Ampoule() {
        this.status = false;
    }

    public void clic(){
        this.status = !this.status;
    }

    @Override
    public String toString() {
        if(this.status ){
            return "Allumée";
        }
        return "Eteinte";
    }
}
