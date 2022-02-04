package com.example.demo.controller;

import com.example.demo.entity.OcEntityAttr;
import com.example.demo.repository.OcEntityAttrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orgchart")
public class OcEntityAttrController {
    @Autowired
    OcEntityAttrRepository ocEntityAttrRepository;

    @GetMapping("/ocEntityAttr")
    public List<OcEntityAttr> getAllOcEntityAttr()
    {
        List<OcEntityAttr> ocEntityAttrs = ocEntityAttrRepository.findAll();
        return ocEntityAttrs;
    }

    @GetMapping("/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }

    @GetMapping("/{id}")
    public void getLocationForEntityId(@PathVariable(name = "id") Long id)
    {

    }
}
