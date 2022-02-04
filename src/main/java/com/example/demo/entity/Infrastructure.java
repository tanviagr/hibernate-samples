package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Infrastructure {
    @Id
    private String id;

    private String infrastructureDescription;

    public Infrastructure() {
    }

    public Infrastructure(String id, String infrastructureDescription) {
        this.id = id;
        this.infrastructureDescription = infrastructureDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfrastructureDescription() {
        return infrastructureDescription;
    }

    public void setInfrastructureDescription(String infrastructureDescription) {
        this.infrastructureDescription = infrastructureDescription;
    }
}

