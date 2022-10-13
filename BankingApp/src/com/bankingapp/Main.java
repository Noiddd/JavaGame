package com.bankingapp;

public class Main {
    public static void main(String[] args) {
        Account dionAccount = new Account("12345", 5000, "Dion", "dion@email.com", "98765432");

        dionAccount.depositMoney(1000);
        System.out.println(dionAccount.getBalance());

        dionAccount.withdrawMoney(5000);
        System.out.println(dionAccount.getBalance());
    }
}
