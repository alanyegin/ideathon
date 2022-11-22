package com.personalisation.merchantService.controller;

import com.personalisation.merchantService.model.merchant;
import com.personalisation.merchantService.service.merchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class merchantController {

    @Autowired
    private merchantService merchantService;

    @GetMapping("merchant/{id}")
    public merchant getMerchantById(@PathVariable Integer id){
        return merchantService.getMerchantById(id);
    }

    //get merchant tags from name
    @GetMapping("merchant/{name}")
    public String getMerchantTagFromName(@PathVariable String name){
        return merchantService.getMerchantTagFromName(name);
    }

}
