package com.personalisation.productservice.controller;

import com.personalisation.productservice.model.tag;
import com.personalisation.productservice.model.transaction;
import com.personalisation.productservice.model.transactionList;
import com.personalisation.productservice.repository.tagRepository;
import com.personalisation.productservice.service.tagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class tagController {

    @Autowired
    private tagService tagService;

    @GetMapping("tag/id/{id}")
    public tag getTagById(@PathVariable Integer id){
        return tagService.getTagById(id);
    }

}
