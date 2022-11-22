package com.personalisation.productservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class merchant {
    @Id
    private Integer id;
    private String merchant;
    @ManyToMany
    private List<tag> merchantTags;

    public merchant(Integer id, String merchant, List<tag> merchantTags) {
        this.id = id;
        this.merchant = merchant;
        this.merchantTags = merchantTags;
    }

    public Integer getId() {
        return id;
    }

    public String getMerchant() {
        return merchant;
    }

    public List<tag> getMerchantTags() {
        return merchantTags;
    }

    public merchant(){}
}
