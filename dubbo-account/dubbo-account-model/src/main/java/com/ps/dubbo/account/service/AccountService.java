package com.ps.dubbo.account.service;

public interface AccountService {
    /**
     * debit balance of user's account
     */
    void debit(String userId, int money);
}
