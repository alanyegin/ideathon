package com.personalisation.productservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class transaction {
    private Integer id;
    private Integer price;
    private Integer accountId;
    private String type;
    private String date;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }
}
