package com.tyb1222.dao.impl;

import com.tyb1222.beans.AccountInfo;
import com.tyb1222.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Override
    public void pay(AccountInfo fromAccount, AccountInfo toAccount) {

    }

    @Override
    public AccountInfo get(int userId) {
        return null;
    }
}
