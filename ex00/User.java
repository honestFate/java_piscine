package ex00;

import java.util.UUID;

public class User {

    private Integer id;
    private String name;
    private Integer balance;

    User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void printState() {
        System.out.println("----User state----");
        System.out.print("Name: ");
        System.out.println(this.name);
        System.out.print("User id: ");
        System.out.println(this.id);
        System.out.print("Balance: ");
        System.out.println(this.balance);
        System.out.println("----User state end----");
    }
}
