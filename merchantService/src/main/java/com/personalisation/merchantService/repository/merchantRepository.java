package com.personalisation.merchantService.repository;


import com.personalisation.merchantService.model.merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface merchantRepository extends JpaRepository<merchant, Integer> {
    merchant findByName(String name);
}
