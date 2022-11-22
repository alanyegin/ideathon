package com.personalisation.transactionservice.repository;

import com.personalisation.transactionservice.model.transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface transactionRepository extends JpaRepository<transaction, Integer> {
    List<transaction> findByAccountId(Integer accountId);
}
