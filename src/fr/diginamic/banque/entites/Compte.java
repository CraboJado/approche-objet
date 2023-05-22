package fr.diginamic.banque.entites;

public class Compte {
    private String account;
    private int balance;

    public Compte (String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CompteNormal {" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                '}';
    }
}
