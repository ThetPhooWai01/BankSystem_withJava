package com.BankingSystem;

import java.util.Scanner;

public class Menu {
    public Menu(Scanner scanner, AccCreate acc){
        int j=0;
        do {
            System.out.println("welcome to " + acc.getName() + "!\n");
            System.out.println("1. Deposite\n" +
                    "2.Withdraw\n" +
                    "3.Balance\n" +
                    "4.Exit");
             j=scanner.nextInt();
             switch (j){
                 case 1:
                     new Deposite(scanner,acc);
                     break;
                 case 2:
                     new Withdraw(scanner,acc);
                     break;
                 case 3:
                     System.out.println("Your balance is :"+ acc.getBalance());
                     break;
                 case 4:
                     new Main();
             }
        }while(j!=4);

    }

}
