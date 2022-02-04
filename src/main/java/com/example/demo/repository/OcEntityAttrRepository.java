package com.example.demo.repository;

import com.example.demo.entity.OcEntityAttr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OcEntityAttrRepository extends JpaRepository<OcEntityAttr, Long> {
    @Query(value = "SELECT OEA.*, L.* FROM OC_ENTITY_ATTR INNER JOIN LOCATION L WHERE ATTR_TYPE_ID = 1 AND OC_ENTITY_ID = ?1", nativeQuery = true)
    public Optional<OcEntityAttr> selectAllLocationForId(Long id);
}
