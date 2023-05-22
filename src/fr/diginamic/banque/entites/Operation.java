package fr.diginamic.banque.entites;

public abstract class Operation {
    protected String dateOperation;
    protected double amount;

    public Operation(String dateOperation, double amount) {
        this.dateOperation = dateOperation;
        this.amount = amount;
    }

    public abstract String getType();

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
