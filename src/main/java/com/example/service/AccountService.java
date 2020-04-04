package com.example.service;

import com.example.domain.Account;
import com.example.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findOne(Integer id) {
        return accountRepository.getOne(id);
    }

    public Account create(Account account) {
        return accountRepository.save(account);
    }

    public Account update(Account account) {
        return accountRepository.save(account);
    }

    public void delete(Integer id) {
        accountRepository.deleteById(id);
    }



//    public void delete(Account account) {
//        accountRepository.delete(account);
//    }
}
