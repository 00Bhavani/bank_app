package com.bankapp.dao;

import com.bankapp.dto.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountDaoImpl implements AccountDao {
private Map<Integer,Account> accounts = new HashMap<>();
private int accountNumberSequence = 1000;
    @Override
    public Account createAccount(String customerName, String accountType, double initialBalance) {
     int newAccountNum = ++accountNumberSequence;
     Account account = new Account(newAccountNum,customerName,accountType,initialBalance);
     accounts.put(newAccountNum,account);
     System.out.println("success"+account);
     return  account;
    }
}
