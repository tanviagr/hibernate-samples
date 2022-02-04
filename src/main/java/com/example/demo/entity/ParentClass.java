package com.example.demo.entity;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.MetaValue;

import javax.persistence.*;

@Entity
public class ParentClass {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String description;

    @Any(
            metaColumn = @Column(name = "ITEM_TYPE")
    )
    @AnyMetaDef(
            idType = "long",
            metaType = "string",
            metaValues = {
                    @MetaValue(targetEntity = Book.class, value = "B"),
                    @MetaValue(targetEntity = DVD.class, value = "D")
            }
    )
    @JoinColumn(name = "ITEM_ID")
    private Object entity;

    public ParentClass(long id, String description, Object entity) {
        this.id = id;
        this.description = description;
        this.entity = entity;
    }

    public ParentClass() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }
}
