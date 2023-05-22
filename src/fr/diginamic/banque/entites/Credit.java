package fr.diginamic.banque.entites;

public class Credit extends Operation{
    public Credit(String dateOperation, double amount) {
        super(dateOperation, amount);
    }

    @Override
    public String toString(){
        return "date : " + dateOperation + '\'' + "amount : " + amount;
    }

    @Override
    public String getType(){
        return "CREDIT" ;
    }
}
