package com.personalisation.transactionservice.service;

import com.personalisation.transactionservice.model.transaction;
import com.personalisation.transactionservice.repository.transactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class transactionService {

    @Autowired
    private transactionRepository repository;

    // populate transactions list
    public List<transaction> retrieveAllTransactions(){
        return repository.findAll();
    }

    public List<transaction> retrieveTransactionsByAccountId(Integer accountId) {
        return repository.findByAccountId(accountId);
    }
}

