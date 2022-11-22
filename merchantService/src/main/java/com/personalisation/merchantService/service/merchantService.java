package com.personalisation.merchantService.service;

import com.personalisation.merchantService.model.merchant;
import com.personalisation.merchantService.repository.merchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class merchantService {

    @Autowired
    private merchantRepository repository;
    public merchant getMerchantById(Integer id) {
        Optional<merchant> merchantById = repository.findById(id);
        if (merchantById == null){
            return null;
        }
        return merchantById.get();
    }

    public String getMerchantTagFromName(String name) {
        merchant merchant = repository.findByName(name);
        return merchant.getTagName();
    }
}
