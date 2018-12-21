package com.tyb1222.dao;

import com.tyb1222.beans.AccountInfo;

public interface AccountDao {

    void pay(AccountInfo fromAccount,AccountInfo toAccount);

    AccountInfo get(int userId);
}
