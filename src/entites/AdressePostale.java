package entites;

public class AdressePostale {
    int streetNumber;
    String streetName;
    int codePostal;
    String city;

    public AdressePostale(int snumber, String sname, int cpostal, String cty){
        streetNumber = snumber;
        streetName = sname;
        codePostal = cpostal;
        city = cty;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", codePostal=" + codePostal +
                ", city='" + city + '\'' +
                '}';
    }
}
