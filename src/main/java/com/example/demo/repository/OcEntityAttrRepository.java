package com.example.demo.repository;

import com.example.demo.entity.OcEntityAttr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcEntityAttrRepository extends JpaRepository<OcEntityAttr, Long> {
}
