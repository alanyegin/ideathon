package com.personalisation.productservice.repository;

import com.personalisation.productservice.model.tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface tagRepository extends JpaRepository<tag,Integer> {
    tag findByName(String name);

    List<tag> findByNameIn(List<String> tagNames);
}
