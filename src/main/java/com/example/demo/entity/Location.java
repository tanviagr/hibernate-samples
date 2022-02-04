package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "LOCATION", schema = "public")
public class Location {
    @Id
    @Column(name = "LOC_ID")
    private Long locId;

    @Column(name = "LOC_NAME")
    private String locName;

}
