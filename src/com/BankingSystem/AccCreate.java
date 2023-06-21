package com.BankingSystem;

public class AccCreate {
    private String name;
    private int password;
    private double balance;
    private int id;

    public AccCreate(String name, int password, double balance, int id) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.id = id;
    }

    public AccCreate() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
