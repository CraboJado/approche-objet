package fr.diginamic.banque.entites;

public class Debit extends Operation{
    public Debit(String dateOperation, double amount) {
        super(dateOperation, amount);
    }
    @Override
    public String toString(){

        return "date : " + dateOperation + '\'' + "amount : " + amount;
    }

    @Override
    public String getType(){
        return "DEBIT" ;
    }
}
