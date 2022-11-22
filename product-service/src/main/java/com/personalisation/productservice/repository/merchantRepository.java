package com.personalisation.productservice.repository;

import com.personalisation.productservice.model.merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface merchantRepository extends JpaRepository<merchant, Integer> {
    merchant findByMerchant(String merchant);
}
