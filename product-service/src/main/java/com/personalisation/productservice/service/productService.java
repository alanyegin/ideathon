package com.personalisation.productservice.service;

import com.personalisation.productservice.model.product;
import com.personalisation.productservice.model.tag;
import com.personalisation.productservice.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class productService {

    @Autowired
    private productRepository repository;
    @Autowired
    private tagService tagService;

    public product findProductById(Integer productId){
        Optional<product> product =  repository.findById(productId);
        if (product == null){
            return null;
        }
        return product.get();
    }

    // enter tags from transactions here to find the tags by products.
    // enter list of keys from transactions tags to here to get back products by tags
    public List<product> findProductsByTags(List<tag> tags){

        List<product> productsByTags = repository.findByTagsIn(tags);
        if (productsByTags == null) {
            return null;
        }
        return productsByTags;
    }

    public List<Optional<product>> findProductsWithScores(){

        Map<String,Integer> tagScores = tagService.tagScores();

        Map<Integer, Integer> productIdToScore = new HashMap<>();

        List<String> tagNames = List.copyOf(tagScores.keySet());
        List<product> productsByTags = repository.findByTagsIn(tagService.findByNames(tagNames));


        for ( product product: productsByTags) {
            List<tag> productTags = product.getTags();
            Integer cumulativeProductScore = 0;
            for ( tag tag: productTags) {
                cumulativeProductScore += tagScores.get(tag.getName());
            }
            productIdToScore.put(product.getId(),cumulativeProductScore);
        }

        List<Optional<product>> top3Products = new ArrayList<>();

        // loop for 3 items currently only 1 item and very little transactions
        Integer bestMatchProductId = Collections.max(productIdToScore.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
        top3Products.add(repository.findById(bestMatchProductId));
        productIdToScore.remove(bestMatchProductId);

        return top3Products;
    }

}
