package com.bankapp.dao;

import com.bankapp.dto.Account;

public interface AccountDao {
    Account createAccount(String customerName,String accountType,double initialBalance);
}
