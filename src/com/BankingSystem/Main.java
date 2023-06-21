package com.BankingSystem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    static int lastId=0;
    private static ArrayList<AccCreate> account;
    public static void main(String[] args) {
        account=new ArrayList<>();
        scan = new Scanner(System.in);
        int i=0;


        do {
            System.out.println("Welcome from bank project!!");
            System.out.println("1.Create your account!");
            System.out.println("2.Login");
            System.out.println("3.exit");
            i = scan.nextInt();

            switch (i) {
                case 1:
                   new CreateAcc(scan,lastId,account);
                    break;
                case (2):
                    new Login(scan,account);
                    break;

            }
        }while(i!=3);

    }

    }

