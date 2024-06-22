package com.zunayedology.campaignette.service;

import com.zunayedology.campaignette.entity.Account;
import com.zunayedology.campaignette.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    public Account updateAccount(Long id, Account updatedAccount) {
        return accountRepository.findById(id).map(account -> {
            account.setName(updatedAccount.getName());
            account.setPassword(updatedAccount.getPassword());
            account.setEmail(updatedAccount.getEmail());
            account.setPhones(updatedAccount.getPhones());
            return accountRepository.save(account);
        }).orElseThrow(() -> new RuntimeException("Account Not Found!"));
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
