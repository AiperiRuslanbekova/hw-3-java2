package com.company;


public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum)
            throw new LimitException("Не достатоно средств для снятия 6000с! ", amount);
        else amount -= sum;
    }
}
