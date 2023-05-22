package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        Credit credit1 = new Credit("22/05/2023",200);
        Credit credit2 = new Credit("22/06/2023",400);
        Debit debit1 = new Debit("22/07/2023",600);
        Debit debit2 = new Debit("22/08/2023",800);
        operations[0] = credit1;
        operations[1] = credit2;
        operations[2] = debit1;
        operations[3] = debit2;

        double sum = 0;
        for(Operation ele:operations){
            System.out.println(ele);
            System.out.println(ele.getType());
            if(ele.getType() == "CREDIT") {
                System.out.println(ele.getType());
                System.out.println(ele.getAmount());
                sum = sum + ele.getAmount();
            }else{
                System.out.println(ele.getType());
                sum = sum - ele.getAmount();
            }
        }

        System.out.println(sum);
    }
}
