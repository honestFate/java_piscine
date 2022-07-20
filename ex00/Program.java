package ex00;

import java.util.UUID;

public class Program {

    public static void main(String[] args) {
        User john = new User();
        User mike = new User();
        Transaction transaction = new Transaction();

        john.setId(0);
        john.setName("John");
        john.setBalance(111);
        john.printState();

        mike.setId(1);
        mike.setName("Mike");
        mike.setBalance(-222);
        mike.printState();
        mike.setBalance(222);
        mike.printState();

        transaction.setRecipient(john);
        transaction.setSender(mike);
        transaction.setType(Transaction.TransferType.DEBIT);
        transaction.setAmount(333);
        transaction.printInfo();
        transaction.setAmount(-333);
        transaction.printInfo();
        transaction.setType(Transaction.TransferType.CREDIT);
        transaction.setAmount(-333);
        transaction.printInfo();
    }
}
