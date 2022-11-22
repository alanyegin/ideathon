package com.personalisation.productservice.model;

import java.util.ArrayList;
import java.util.List;

public class transactionList {
    private List<transaction> transactions;

    public transactionList() {
        this.transactions = new ArrayList<>();
    }

    public List<transaction> getTransactions() {
        return transactions;
    }
}
