package com.personalisation.productservice.proxy;

import com.personalisation.productservice.model.product;
import com.personalisation.productservice.model.transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@FeignClient(name="transaction-service" )
public interface transactionServiceProxy {

    @GetMapping("/transactions/account/2")
    public List<transaction> getTransactions();

}
