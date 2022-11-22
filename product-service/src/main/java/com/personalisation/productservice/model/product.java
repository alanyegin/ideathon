package com.personalisation.productservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class product {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "tags")
    @ManyToMany
    private List<tag> tags;

    public product(Integer id, String name, List<tag> tags, Integer price) {
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<tag> getTags() {
        return tags;
    }

    public Integer getPrice() {
        return price;
    }

    public product(){}
}
