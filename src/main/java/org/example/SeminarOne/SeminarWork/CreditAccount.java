package org.example.SeminarOne.SeminarWork;

import org.example.SeminarOne.SeminarWork.Account;

public class CreditAccount extends Account {
    private Double percent;

    public CreditAccount(Integer numAccount, String owner, Double balance, Double percent) {
        super(numAccount, owner, balance);
        this.percent = percent;
    }
    public CreditAccount() {
        }
    public Double getPercent() {
        return percent;
    }
    public void setPercent(Double percent) {
        this.percent = percent;
    }
    void calculateInterest(){
        Double res = getBalance() * percent / 100;
        withdraw(res);
    }
}
