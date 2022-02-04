package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DVD {
    @Id
    private Long id;

    private String director;

    public DVD(Long id, String director) {
        this.id = id;
        this.director = director;
    }

    public DVD() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
