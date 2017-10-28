package com.bvan.oop.lessons3_4.account;

/**
 * @author bvanchuhov
 */
public class InMemoryAccount implements Account {

    private long money;

    @Override
    public boolean withdraw(long moneyForWithdrawal) {
        if (money < moneyForWithdrawal) {
            return false;
        }
        money -= moneyForWithdrawal;
        return true;
    }
}
