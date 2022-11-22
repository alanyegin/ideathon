package com.personalisation.productservice.controller;

import com.personalisation.productservice.model.product;
import com.personalisation.productservice.model.tag;
import com.personalisation.productservice.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class productController {

    @Autowired
    private productService productService;

    @GetMapping("product/{productId}")
    public product getProductById(@PathVariable Integer productId){
        return productService.findProductById(productId);
    }

    @GetMapping("product/tags")
    public List<product> getProductByTags(){
        List<tag> tagsList = new ArrayList<>();
        return productService.findProductsByTags(tagsList);
    }

    @GetMapping("product/suggestion")
    public List<Optional<product>> getProductRecommendations(){

        return productService.findProductsWithScores();
    }
}
