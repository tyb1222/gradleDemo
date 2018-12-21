package com.tyb1222.service;

import com.tyb1222.beans.AccountInfo;

public interface AccountService {

        AccountInfo get(int userId);

        void pay(AccountInfo fromAccount, AccountInfo toAccount);
}
