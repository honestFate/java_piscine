package ex00;

import java.util.UUID;

public class Transaction {

    enum TransferType {
        DEBIT,
        CREDIT
    }

    private final String id;
    private User recipient;
    private User sender;
    private TransferType type;
    private Integer amount;

    public Transaction() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public TransferType getType() {
        return type;
    }

    public void setType(TransferType transferCategory) {
        this.type = transferCategory;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(int transferAmount) {
        if ((this.type == TransferType.DEBIT && transferAmount > 0)
            || (this.type == TransferType.CREDIT && transferAmount < 0)) {
            this.amount = transferAmount;
        }
    }

    public void printInfo() {
        System.out.println("----Transaction info----");
        System.out.print("Transfer id: ");
        System.out.println(getId());
        System.out.println("Recipient:");
        getRecipient().printState();
        System.out.println("Sender:");
        getSender().printState();
        System.out.print("Type: ");
        System.out.println(getType());
        System.out.print("Amount: ");
        System.out.println(getAmount());
        System.out.println("----Transaction info end----");
    }
}
