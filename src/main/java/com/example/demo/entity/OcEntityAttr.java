package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "OC_ENTITY_ATTR", schema = "public")
public class OcEntityAttr {
    @Id
    @Column(name = "OC_ENTITY_ID")
    private Long ocEntityId;

    @Column(name = "START_DATE")
    private Date startDate;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATTR_TYPE_ID", nullable = false)
    private OcAttrType ocAttrType;

    @Column(name = "CHAR_VALUE")
    private int charValue; //conditional join

    public OcEntityAttr(Long ocEntityId, Date startDate, OcAttrType ocAttrType, int charValue) {
        this.ocEntityId = ocEntityId;
        this.startDate = startDate;
        this.ocAttrType = ocAttrType;
        this.charValue = charValue;
    }

    public OcEntityAttr() {
    }

    public Long getOcEntityId() {
        return ocEntityId;
    }

    public void setOcEntityId(Long ocEntityId) {
        this.ocEntityId = ocEntityId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public OcAttrType getOcAttrType() {
        return ocAttrType;
    }

    public void setOcAttrType(OcAttrType ocAttrType) {
        this.ocAttrType = ocAttrType;
    }

    public int getCharValue() {
        return charValue;
    }

    public void setCharValue(int charValue) {
        this.charValue = charValue;
    }

}
