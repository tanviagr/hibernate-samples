package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class AttrType {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    private String attrDescription;

    @OneToMany(mappedBy = "attrType", cascade = CascadeType.ALL)
    List<OcEntityAttr> ocEntityAttrList;

    public AttrType(long id, String attrDescription, List<OcEntityAttr> ocEntityAttrList) {
        this.id = id;
        this.attrDescription = attrDescription;
        this.ocEntityAttrList = ocEntityAttrList;
    }

    public AttrType() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAttrDescription() {
        return attrDescription;
    }

    public void setAttrDescription(String attrDescription) {
        this.attrDescription = attrDescription;
    }

    public List<OcEntityAttr> getOcEntityAttrList() {
        return ocEntityAttrList;
    }

    public void setOcEntityAttrList(List<OcEntityAttr> ocEntityAttrList) {
        this.ocEntityAttrList = ocEntityAttrList;
    }
}
