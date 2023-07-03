package org.example.SeminarOne.SeminarWork;

public class Account {
    private Integer numAccount;
    private String owner;
    private Double balance;

    public Account(Integer numAccount, String owner, Double balance) {
        this.numAccount = numAccount;
        this.owner = owner;
        this.balance = balance;
    }

    public Account() {
    }

    public Integer getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(Integer numAccount) {
        this.numAccount = numAccount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    void deposit (Double amount){
        balance = amount + balance;
    }
    void withdraw(Double amount){
        if (balance < amount){
            System.out.println("Недостаточно средств нв счете " + balance);
        }
        else {
            balance = balance - amount;
        }
    }
}
