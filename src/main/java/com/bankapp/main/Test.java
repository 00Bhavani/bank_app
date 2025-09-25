package com.bankapp.main;

import com.bankapp.dao.AccountDao;
import com.bankapp.dao.AccountDaoImpl;
import com.bankapp.dto.Account;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDao adao = new AccountDaoImpl();
    System.out.println("Enter Customer name:");
    String customerName = sc.nextLine();

    System.out.println("Enter the account type:savings/current");
    String accountType = sc.nextLine();

    System.out.println("Enter initial balance");
    double initialBalance = 0.0;
    try{
        initialBalance = Double.parseDouble(sc.nextLine());

    }catch (NumberFormatException e) {
        System.out.println("Invalid input setting balance to 0");
    }
    Account newAccount = adao.createAccount(customerName,accountType,initialBalance);
    System.out.println("Created account details:");
    System.out.println(newAccount);
    sc.close();
    }
}
