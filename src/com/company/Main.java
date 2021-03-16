package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true) {

            try {
                System.out.println(bankAccount.getAmount() + " сом");
                bankAccount.withDraw(6000);
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                try {
                    bankAccount.withDraw((int)le.getRemainingAmount());
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                System.out.println(bankAccount.getAmount() + " som");
            }
        }
    }
}