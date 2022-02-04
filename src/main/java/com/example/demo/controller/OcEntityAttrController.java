package com.example.demo.controller;

import com.example.demo.entity.OcEntityAttr;
import com.example.demo.repository.OcEntityAttrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OcEntityAttrController {

    @Autowired
    OcEntityAttrRepository repo;

    @GetMapping("ocEntityAttr/getAll")
    public List<OcEntityAttr> getAllOcEntityAttr()
    {
        return repo.findAll();
    }
}
