package com.personalisation.productservice.repository;

import com.personalisation.productservice.model.product;
import com.personalisation.productservice.model.tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.text.html.HTML;
import java.util.List;

public interface productRepository extends JpaRepository<product,Integer> {
    List<product> findByTagsIn(List<tag> tags);
}
