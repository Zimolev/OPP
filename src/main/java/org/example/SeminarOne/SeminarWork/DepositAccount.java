package org.example.SeminarOne.SeminarWork;

import org.example.SeminarOne.SeminarWork.Account;

public class DepositAccount extends Account {
    private Double percent;

    public DepositAccount(Integer numAccount, String owner, Double balance, Double percent) {
        super(numAccount, owner, balance);
        this.percent = percent;
    }
    public DepositAccount() {
           }


    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }
    void  addInterest(){
        Double res = getBalance() * percent / 100;
        deposit(res);
    }
}
