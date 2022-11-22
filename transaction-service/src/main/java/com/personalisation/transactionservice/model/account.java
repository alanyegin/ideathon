package com.personalisation.transactionservice.model;

public class account {
    private Integer accountNumber;
    private Integer sortCode;

    public account(Integer accountNumber, Integer sortCode) {
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Integer getSortCode() {
        return sortCode;
    }
}
