package com.personalisation.productservice.service;

import com.netflix.discovery.converters.Auto;
import com.personalisation.productservice.model.tag;
import com.personalisation.productservice.model.transaction;
import com.personalisation.productservice.model.transactionList;
import com.personalisation.productservice.proxy.transactionServiceProxy;
import com.personalisation.productservice.repository.merchantRepository;
import com.personalisation.productservice.repository.tagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class tagService {

    @Autowired
    private tagRepository repository;
    @Autowired
    private transactionServiceProxy proxy;
    @Autowired
    private merchantRepository merchantRepo;

    public tag getTagById(Integer id){
        Optional<tag> tagById = repository.findById(id);

        if (tagById == null){
            return null;
        }
        return tagById.get();
    }

    public tag getTagByName(String name) {
        tag tagByName = repository.findByName(name);
        return tagByName;
    }

    public Map<String,Integer> tagScores(){
        Map<String, Integer> tagScoreMap = new HashMap<>();

//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<List<transaction>> response = restTemplate.exchange("http://localhost:8080/transactions/account/1",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<transaction>>() {});
//
//        List<transaction> transactions = response.getBody();

        List<transaction> transactions = proxy.getTransactions();

        for (int i = 0; i < transactions.size(); i++) {

            transaction transaction = transactions.get(i);
            List<tag> tags = merchantRepo.findByMerchant(transaction.getMerchant()).getMerchantTags();
            for (tag tag : tags) {
                tagScoreMap.merge(tag.getName(), 1, (a, b) -> a + b);
            }
        }
        return tagScoreMap;
    }

    public List<tag> findByNames(List<String> tagNames) {
        return repository.findByNameIn(tagNames);
    }
}
