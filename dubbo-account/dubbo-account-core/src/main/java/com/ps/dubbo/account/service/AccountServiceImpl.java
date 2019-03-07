package com.ps.dubbo.account.service;

import com.ps.dubbo.account.dao.repository.AccountRepository;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0", timeout = 1000,interfaceClass = AccountService.class)
public class AccountServiceImpl implements AccountService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private AccountRepository accountRepository;

    public void debit(String userId, int money) {
        logger.info("debit account with userId={}, money={}", userId,money);
        Integer affectedRows = this.accountRepository.debitAccount(userId,money);
        logger.info("Account service with affected rows: {}", affectedRows);
    }
}
