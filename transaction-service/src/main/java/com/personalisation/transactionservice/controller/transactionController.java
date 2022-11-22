package com.personalisation.transactionservice.controller;

import com.personalisation.transactionservice.model.transaction;
import com.personalisation.transactionservice.service.transactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class transactionController {

    private transactionService transactionService;

    public transactionController(transactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("transactions")
    public List<transaction> getAllTransactions(){
        return transactionService.retrieveAllTransactions();
    }

    @GetMapping("transactions/account/{accountId}")
    public List<transaction> getTransactionsByAccountId(
            @PathVariable Integer accountId){
        return transactionService.retrieveTransactionsByAccountId(accountId);
    }
}
