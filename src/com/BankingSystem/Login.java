package com.BankingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {


    public Login(Scanner scan, ArrayList<AccCreate> account){
        System.out.println("Enter your account id");
        int id=scan.nextInt();
        System.out.println("Enter your password");
        int passcode = scan.nextInt();
        AccCreate accounts=new AccCreate();
        boolean exist=false;
        for(AccCreate acc: account){
            if(acc.getId()==id&&acc.getPassword()==passcode){
                exist=true;
                accounts=acc;
            }

        }
        if(exist){
            new Menu(scan,accounts);
        }else{
            System.out.println("Account doesn't exist");
        }
    }
}
