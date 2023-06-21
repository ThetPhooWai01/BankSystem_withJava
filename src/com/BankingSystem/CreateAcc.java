package com.BankingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAcc {

    public CreateAcc(Scanner scan,int lastId, ArrayList<AccCreate> account){
        System.out.println("Enter your name");
        String name=scan.next();
        System.out.println("Enter your password");
        int pass=scan.nextInt();
        System.out.println("Confirm your password");
        int confirmpass=scan.nextInt();
        System.out.println("Enter your balance");
        double balance=scan.nextDouble();
        if (pass != confirmpass){
            System.out.println("Password is not Match..Try again");
            return;
        }
        int id=10000+lastId;
        lastId=lastId+1;
        AccCreate acc=new AccCreate(name,pass,balance,id);
        account.add(acc);
        System.out.println("Your acc id:"+id);
        new Menu(scan,acc);
    }
}
