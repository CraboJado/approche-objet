package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double rate;

    public  CompteTaux(String account, int balance, double rate){
        super(account,balance);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    @Override
    public String toString(){
        String accountInfo = super.toString();
        return "Compte rate:" + rate + '\'' + "accountInfo" + accountInfo;
    }

}
