package com.personalisation.productservice.service;

import com.personalisation.productservice.model.merchant;
import com.personalisation.productservice.model.tag;
import com.personalisation.productservice.repository.merchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class merchantService {
    // merchant to tag
    @Autowired
    private merchantRepository repository;

    public List<tag> getMerchantTag(String name){

        merchant merchant = repository.findByMerchant(name);
        return merchant.getMerchantTags();
    }
}
