package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.MetaValue;

import javax.persistence.*;

@Entity
public class OcEntityAttr {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    private String OcEntityName;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attr_id", insertable = false, updatable = false)
    private AttrType attrType;

    @Any(
            metaColumn = @Column(name = "attr_id")
    )
    @AnyMetaDef(
            idType = "string",
            metaType = "int",
            metaValues = {
                    @MetaValue(targetEntity = Location.class, value = "1"),
                    @MetaValue(targetEntity = Infrastructure.class, value = "2")
            }
    )
    @JoinColumn(name = "char_value")
    private Object entity;

    public OcEntityAttr(long id, String ocEntityName, AttrType attrType, Object entity) {
        this.id = id;
        OcEntityName = ocEntityName;
        this.attrType = attrType;
        this.entity = entity;
    }

    public OcEntityAttr() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOcEntityName() {
        return OcEntityName;
    }

    public void setOcEntityName(String ocEntityName) {
        OcEntityName = ocEntityName;
    }

    public AttrType getAttrType() {
        return attrType;
    }

    public void setAttrType(AttrType attrType) {
        this.attrType = attrType;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }
}
