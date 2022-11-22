package com.personalisation.merchantService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class merchant {
    @Id
    private Integer id;
    private String name;
    private String tagName;

    public merchant(Integer id, String name, String tagName) {
        this.id = id;
        this.name = name;
        this.tagName = tagName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTagName() {
        return tagName;
    }
}
