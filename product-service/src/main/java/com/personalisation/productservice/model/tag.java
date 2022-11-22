package com.personalisation.productservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tag {
    @Id
    private Integer Id;
    private String name;

    public tag(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public tag(){};
}
