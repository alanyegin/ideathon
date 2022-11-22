package com.personalisation.transactionservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "transaction_data")
public class transaction {
    @Id
    private Integer id;
    @Column(name = "price")
    private Integer price;
    @Column(name = "accountId")
    private Integer accountId;
    @Column(name = "type")
    private String type;
    @Column(name = "date_of_transaction")
    private String date;
    @Column(name = "merchant")
    private String merchant;

    public transaction(Integer id, Integer price, Integer accountId, String type, String date, String merchant) {
        this.id = id;
        this.accountId = accountId;
        this.price = price;
        this.type = type;
        this.date = date;
        this.merchant = merchant;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Integer getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getMerchant() {
        return merchant;
    }

    public transaction(){}
}
