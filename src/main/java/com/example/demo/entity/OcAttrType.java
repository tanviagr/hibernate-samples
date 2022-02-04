package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "OC_ATTR_TYPE", schema = "public")
public class OcAttrType {
    @Id
    @Column(name = "ATTR_TYPE_ID")
    private Long attrTypeId;

    @Column(name = "ATTR_NAME")
    private String attrName;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(mappedBy = "ocAttrType", cascade = CascadeType.ALL)
    private List<OcEntityAttr> ocEntityAttrs;

    public OcAttrType(Long attrTypeId, String attrName, String description) {
        this.attrTypeId = attrTypeId;
        this.attrName = attrName;
        this.description = description;
    }

    public OcAttrType() {
    }

    public Long getAttrTypeId() {
        return attrTypeId;
    }

    public void setAttrTypeId(Long attrTypeId) {
        this.attrTypeId = attrTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<OcEntityAttr> getOcEntityAttrs() {
        return ocEntityAttrs;
    }

    public void setOcEntityAttrs(List<OcEntityAttr> ocEntityAttrs) {
        this.ocEntityAttrs = ocEntityAttrs;
    }

}
