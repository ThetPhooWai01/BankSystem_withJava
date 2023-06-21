package com.BankingSystem;

import java.util.Scanner;

public class Withdraw {
    public Withdraw(Scanner scan, AccCreate acc){
        System.out.println("Enter amount:");
        int balance=scan.nextInt();
        acc.setBalance(acc.getBalance()-balance);
        System.out.println("Operation done successfully!!");
    }
}
